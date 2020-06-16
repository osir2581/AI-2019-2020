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

        Repository r = new Repository("persons.txt");
        ArrayList<String> genuri = r.getGenuri();
        ArrayList<Integer> greutati = r.getGreutati();
        ArrayList<Integer> inaltimi = r.getInaltimi();
        ArrayList<Integer> varste =r.getAni();
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
        ArrayList<Double> inaltimiD = Predictie.normalizeaza(inaltimi);
        ArrayList<Double> aniD = Predictie.normalizeaza(varste);
        ArrayList<Double> greutatiD = Predictie.normalizeaza(greutati);


    }
}