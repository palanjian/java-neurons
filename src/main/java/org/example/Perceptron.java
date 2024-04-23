package org.example;

public class Perceptron {

    double intercept;
    double[] weights;
    int inputSize;

    public Perceptron(int inputSize){
        this.inputSize = inputSize;
        weights = new double[inputSize];

        intercept = 0;
    }

    public void train(double[] trainings, int expected){
        if(classify(trainings) == expected){
            System.out.println("Classified correctly!");
            return;
        }

        //e(i)=y(i)-f(Bt(i)x(i)+B0(i))
        double e = expected - classify(trainings);
        System.out.println("e is " + e);
        //B(i+1)=B(i)+0.5e(i)x(i)
        weights = PerceptronUtils.vectorAdd(weights,  PerceptronUtils.vectorMult(trainings, .5 * e));

        intercept = intercept + (.5*e);

        System.out.print("Classified incorrectly, new bias: " + intercept + " and new weights: ");
        PerceptronUtils.print(weights);
    }
    public int classify(double[] inputs){
        return PerceptronUtils.sign(intercept + PerceptronUtils.sumProduct(weights, inputs));
    }
}
