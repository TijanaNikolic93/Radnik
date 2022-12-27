//Napraviti apstraktnu klasu Radnik
//Napraviti Main klasu za ispis
//Sub klase: radnik po satu, radnik po danu, radnik fiksno
//polja: ime, prezime, jmbg, ziro racun, plata
//napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
//u Main klasi podatke za svaki objekat puniti preko Scanner klase


package Main;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner radnik = new Scanner(System.in);

        System.out.println("Ime radnika: ");
        String ime = radnik.next();

        System.out.println("Prezime radnika: ");
        String prezime = radnik.next();

        System.out.println("jmbg: ");
        String jmbg = radnik.next();

        System.out.println("Ziro racun: ");
        String ziroRacun = radnik.next();

        System.out.println("Broj radnih dana: ");
        double danRadnika = radnik.nextDouble();

        Radnik radnikPoDanu = new Dan(ime, prezime, jmbg, ziroRacun, danRadnika);


        Scanner radnik1 = new Scanner(System.in);

        System.out.println("Ime radnika: ");
        String ime1 = radnik1.next();

        System.out.println("Prezime radnika: ");
        String prezime1 = radnik1.next();

        System.out.println("jmbg: ");
        String jmbg1 = radnik1.next();

        System.out.println("Ziro racun: ");
        String ziroRacun1 = radnik1.next();

        System.out.println("Broj radnih sati: ");
        double satRadnika1 = radnik1.nextDouble();

        Radnik radnikPoSat = new Sat(ime1 , prezime1, jmbg1, ziroRacun1, satRadnika1);


        Scanner radnik2 = new Scanner(System.in);

        System.out.println("Ime radnika: ");
        String ime2 = radnik2.next();

        System.out.println("Prezime radnika: ");
        String prezime2 = radnik2.next();

        System.out.println("jmbg: ");
        String jmbg2 = radnik2.next();

        System.out.println("Ziro racun: ");
        String ziroRacun2 = radnik2.next();

        Radnik radnikFiksno = new Fiksno(ime2, prezime2, jmbg2, ziroRacun2);


        radnikPoDanu.isplatiPlatu();
        radnikPoSat.isplatiPlatu();
        radnikFiksno.isplatiPlatu();

    }
}