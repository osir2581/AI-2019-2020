package com.company;

import java.io.FileNotFoundException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class MyClass {

    public static void main(String[] args) {

        Repository r = new Repository("personsNew.txt");
        ArrayList<String> genuri = r.getGenuri();
        ArrayList<Integer> greutati = r.getGreutati();
        double medieBarbati =0;
        double medieFemei =0;
        int nrFemei=0;
        int nrBarbati=0;
        for(int i=0;i<genuri.size();i++)
            if(genuri.get(i).equals("male")) {
                medieBarbati += greutati.get(i);
                nrBarbati++;
            }
            else {
                medieFemei += greutati.get(i);
                nrFemei++;
            }

        medieBarbati/=nrBarbati;
        medieFemei/=nrFemei;
        System.out.println("medieBarbati "+ medieBarbati);
        System.out.println("medieFemei "+ medieFemei);
        if(medieBarbati>medieFemei){
            System.out.println("barbatii au greutate mai mare");
        }
        else
            System.out.println("femeile au greutate mai mare");
        /*Collections.shuffle(elemente);
        elemente.forEach(x->{
            gdp.add(x.get(0));
            freedom.add(x.get(1));
            happiness.add(x.get(2));
        });
        int i;
        ArrayList<Double> x1Invatare = new ArrayList<>();
        ArrayList<Double> x2Invatare = new ArrayList<>();
        ArrayList<Double> yInvatare = new ArrayList<>();

        ArrayList<Double> x1Test = new ArrayList<>();
        ArrayList<Double> x2Test = new ArrayList<>();
        ArrayList<Double> yReal = new ArrayList<>();
        for(i = 0 ;i<0.8*gdp.size();i++)
        {
            x1Invatare.add(gdp.get(i));
            x2Invatare.add(freedom.get(i));
            yInvatare.add(happiness.get(i));
        }
        for(;i<gdp.size();i++){
            x1Test.add(gdp.get(i));
            x2Test.add(freedom.get(i));
            yReal.add(happiness.get(i));
        }
        Predictie p = new Predictie();
        x1Invatare = p.normalizeaza(x1Invatare);
        x1Test = p.normalizeaza(x1Test);
        x2Invatare = p.normalizeaza(x2Invatare);
        x2Test = p.normalizeaza(x2Test);
        Predictie p2 = new Predictie();
        p2.invataDoua(10000,x1Invatare,x2Invatare,yInvatare);
        p.invata(10000,x1Invatare,yInvatare);
        ArrayList<Double> yRezultat2 = p2.testeazaDoua(x1Test,x2Test);
        ArrayList<Double> yRezultat = p.testeaza(x1Test);
        System.out.println("Eroare: "+ p.rootMeanSquareError(yRezultat,yReal));
        System.out.println("Real             | Computat");
        for(int j=0;j< yRezultat.size();j++){
            System.out.println(yReal.get(j)+" | "+yRezultat.get(j));
        }

        System.out.println("Cu doi parametri");
        System.out.println("Eroare: "+ p.rootMeanSquareError(yRezultat2,yReal));
        System.out.println("Real             | Computat");
        for(int j=0;j< yRezultat2.size();j++){
            System.out.println(yReal.get(j)+" | "+yRezultat2.get(j));
        }*/
    }
}
