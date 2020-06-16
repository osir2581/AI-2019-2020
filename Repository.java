package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Repository {

    private ArrayList<ArrayList<Double>> elemente;
    private ArrayList<Integer> greutati;
    private ArrayList<String> genuri;
    private String fisier;
    public Repository(String fisier){
        this.fisier = fisier;
        greutati = new ArrayList<>();
        genuri = new ArrayList<>();
        loadFromFile();
    }

    private void loadFromFile(){
        File f = new File(fisier);
        try {
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while(sc.hasNext()){
                ArrayList<Double> linie = new ArrayList<>();
                String[] params = sc.nextLine().split(",");
                Integer greutate = Integer.parseInt(params[2]);
                String gen = params[3];
                greutati.add(greutate);
                genuri.add(gen);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu exista!");
        }
    }

    public ArrayList<ArrayList<Double>> getElemente(){
        return elemente;
    }

    public ArrayList<Integer> getGreutati() {return greutati;}

    public ArrayList<String> getGenuri() {return genuri;}

}
