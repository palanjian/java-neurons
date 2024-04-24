package main;

public class Vector {
    private double[] values;

    public Vector(double ... v){
        values = new double[v.length];
        for(int i=0; i<v.length; ++i){
            values[i] = v[i];
        }
    }

    public Vector add(Vector v){
        return sum(this, v);
    }
    public Vector multiply(Vector v){
        return product(this, v);
    }

    public Vector multiply(double scalar){
        return product(this, scalar);
    }

    public static Vector sum(Vector v1, Vector v2){
        //if(lengthsdontmatch) throw Exception;
        double[] values = new double[v1.values.length];

        for(int i=0; i<values.length; ++i){
            values[i] = v1.values[i] + v2.values[i];
        }
        return new Vector(values);
    }

    public static Vector product(Vector v1, Vector v2){
        //if(lengthsdontmatch) throw Exception;
        double[] values = new double[v1.values.length];

        for(int i=0; i<values.length; ++i){
            values[i] = v1.values[i] * v2.values[i];
        }
        return new Vector(values);
    }

    public static Vector product(Vector v1, double scalar){
        //if(lengthsdontmatch) throw Exception;
        double[] values = v1.values;

        for(int i=0; i<values.length; ++i){
            values[i] *= scalar;
        }
        return new Vector(values);
    }

    public static double dot(Vector v1, Vector v2){
        //if two matrices are not of same length, throw exception

        double answer = 0;
        for(int i=0; i<v1.values.length; ++i){
            answer += v1.values[i] * v2.values[i];
        }
        return answer;
    }

    public static void print(Vector v){
        System.out.print("[");
        for(double d : v.values){
            System.out.print(d + " ");
        }
        System.out.println("]");
    }
}
