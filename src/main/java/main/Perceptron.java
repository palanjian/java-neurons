package main;

public class Perceptron {

    double intercept; // initialized to 0
    Vector weights; //

    public Perceptron(int inputSize){
        weights = new Vector(new double[inputSize]);
        intercept = 0;
    }

    public void train(Vector trainings, int expected){
        if(classify(trainings) == expected){
            System.out.println("Classified correctly!");
            return;
        }

        //e(i)=y(i)-f(Bt(i)x(i)+B0(i))
        double e = expected - classify(trainings);
        //B(i+1)=B(i)+0.5e(i)x(i)
        weights = trainings.multiply(.5 * e).add(weights);

        intercept = intercept + (.5*e);

        System.out.print("Classified incorrectly, new bias: " + intercept + " and new weights: ");
        Vector.print(weights);
    }

    public int classify(Vector input){
        //sign function
        return intercept + Vector.dot(weights, input) >= 0 ? 1 : -1;
    }
}
