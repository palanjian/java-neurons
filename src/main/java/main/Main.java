package main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter number of Perceptron Inputs");
        Scanner scan = new Scanner(System.in);

        int numberOfInputs = scan.nextInt();

        Perceptron perceptron = new Perceptron(numberOfInputs);

        System.out.println("Enter inputs and output (separated by a comma)");

        while(true){
            String[] inputString = scan.next().split(",");
            double[] inputs = new double[numberOfInputs];

            for(int i=0; i<numberOfInputs; ++i) inputs[i] = Double.parseDouble(inputString[i]);

            int expected = Integer.parseInt(inputString[numberOfInputs]);

            perceptron.train(new Vector(inputs), expected);
        }
    }
}