package org.example;

public class PerceptronUtils {
    public static double sumProduct(double[] matrix1, double[] matrix2){
        //if two matrices are not of same length, throw exception

        double answer = 0;
        for(int i=0; i<matrix1.length; ++i){
            answer += matrix1[i] * matrix2[i];
        }
        return answer;
    }

    public static int sign(double x){
        return x >= 0 ? 1 : -1;
    }

    public static double[] vectorMult(double[] vector, double constant){
        double[] newVector = new double[vector.length];
        for(int i=0; i<vector.length; ++i){
            newVector[i] = vector[i]*constant;
        }
        return newVector;
    }

    public static double[] vectorAdd(double[] matrix1, double[] matrix2){
        double[] added = new double[matrix1.length];
        for(int i=0; i<matrix1.length; ++i){
            added[i] = matrix1[i] + matrix2[i];
        }
        return added;
    }

    public static void print(double[] matrix){
        for(double d : matrix) System.out.print(d + " ");
        System.out.println();
    }
}
