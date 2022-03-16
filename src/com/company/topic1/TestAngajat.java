package com.company.topic1;

public class TestAngajat {
    public static void main(String[] args) {
        Angajat salariat001= new Angajat("Dorin",33);
        salariat001.seteazaSalariul(2000);
        salariat001.seteazaGenul("Masculin");
        salariat001.print();
        Angajat salariat002= new Angajat("Elena",25);
        salariat002.seteazaSalariul(3000);
        salariat002.seteazaGenul("Femenin");
        salariat002.print();


    }
}
