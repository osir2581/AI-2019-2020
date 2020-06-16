package com.company;

import java.util.ArrayList;

public class Predictie {

    private double learning_rate = 0.001;
    private double b0 = 0;
    private double b1 = 0;
    private double b2 = 0;
    private double b3 = 0;

    public static ArrayList<Double> normalizeaza(ArrayList<Integer> a){
        ArrayList<Double> aNew = new ArrayList<>();
        double max=0, min=Integer.MAX_VALUE;
        for(int i=0 ; i < a.size();i++)
        {
            if(max<a.get(i))
                max = a.get(i);
            if(min>a.get(i))
                min = a.get(i);
        }
        for(int i=0 ; i < a.size();i++){
            double element = (a.get(i) - min)/(max-min);
            aNew.add(element);
        }
        return aNew;
    }

    private double sigmoid(double x){
        return 1/(1+Math.exp(-x));
    }



    public void invata(int nrEpoci, ArrayList<Double> x1, ArrayList<Double> x2, ArrayList<Double>x3,  ArrayList<Double> y) {
        double guess;
        double error = 0;
        for (int epoca = 0; epoca < nrEpoci; epoca++) {
            error = 0;
            for (int i = 0; i < x1.size(); i++) {
                guess = sigmoid( b0 + x1.get(i) * b1 + x2.get(i) * b2 + x3.get(i) * b3 );
                error = guess - y.get(i);
                b1 = b1 - learning_rate * error * x1.get(i);
                b2 = b2 - learning_rate * error * x2.get(i);
                b3 = b3 - learning_rate * error * x3.get(i);
            }
        }
    }

    public Double testeaza(Double x1, Double x2, Double x3){

        return b0 + b1 * x1 + b2 * x2 + b3 * x3;

    }

}
