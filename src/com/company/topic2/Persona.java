package com.company.topic2;

public class Persona {
    String nume;
    String gen;
    int varsta;
    private double greutate;

    public Persona(String numePrenumepersona, int varstaPersona, String genPersoana) {
        nume = numePrenumepersona;
        varsta = varstaPersona;
        gen = genPersoana;
    }

    public void seteazaGreutate(double greutateAtribuita) {
        this.greutate = greutateAtribuita;
      System.out.printf("Greutate setata:" + greutate);
    }

    public void print() {
        System.out.println("nume:" + nume);
        System.out.println("varstaAni:" + varsta);
        System.out.println("genSetat:" + gen);


    }
}