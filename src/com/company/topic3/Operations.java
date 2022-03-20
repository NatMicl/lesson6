package com.company.topic3;

public class Operations {
    static void printAritmeticOperations(int a, int b) {
        //int a = 12;
        //int b = 41;
        System.out.println("Adunarea:" + (a + b));
        System.out.println("Scaderea:" + (a - b));
        System.out.println("Inmultirea:" + (a * b));
        System.out.println("Impartirea:" + (a / b));
        System.out.println("Restul impartirii:" + (a % b));
        System.out.println("Pre-Increment:" + (++a));
        System.out.println("Post-Increment:" + (a++));
        System.out.println("Pre-decriment" + (--a));
        System.out.println("Post-decriment" + (a--));
    }

    static void printLogicOperations(int a, int b) {
        //int a = 12;
        //int b = 41;
        System.out.println("Egalitate:" + (a == b));
        System.out.println("Diferenta:" + (a != b));
    }

    static void printRelationarOperations(boolean a, boolean b) {
        //boolean a= true;
        //boolean b= false;
        System.out.println("AND:" + (a && b));
        System.out.println("OR:" + (a || b));
        System.out.println("Negatie:" + (!a));
    }

    static void useForAndWhile(int limita) {
        int index = 20;
       // int limita = 240;

        while (index <= limita) {
            System.out.print(index + " ");
            index++;
        }
        System.out.println("Valoare lui index la finalul executiei while este " + index);

        for (int i = 20; i <= limita; i++) {
            System.out.print(i + "  ");
        }
        System.out.println("Ciclul for s-a executat ");

    }

}
