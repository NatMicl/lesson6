package com.company.topic1;

public class Angajat {
    String nume;
    int varsta;
    double salariu;
    String gen;

    public Angajat(String numePrenume,int varstaAni){
        nume = numePrenume;
        varsta= varstaAni;
    }
    public void seteazaGenul(String genSetat) {
     gen = genSetat;
    }
    public void seteazaSalariul(double salariulBrut) {
        salariu = salariulBrut;
    }
    public void print(){
        System.out.println("nume:"+nume);
        System.out.println("varstaAni:"+varsta);
        System.out.println("genSetat:"+gen);
        System.out.println("salariulBrut:"+salariu);
    }

 }


