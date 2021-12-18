import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */
        student student = new student(new osoba("Matusz", "Kowalski", 59386), wenum.PROGRAMOWANIE);
        student student1 = new student(new osoba("Joanna", "Kowalczyk", 59547), wenum.LOGISTYKA);
        student student2 = new student(new osoba("Jan", "Kulas", 59548), wenum.LOGISTYKA);
        student student3 = new student(new osoba("Zdzisław", "Ktosiowy", 59354), wenum.PROGRAMOWANIE);
        student student4 = new student(new osoba("Jan", "Janowski", 59395), wenum.LOGISTYKA);
        ArrayList<student> friends = new <student>ArrayList();
        friends.add(student);
        friends.add(student1);
        friends.add(student2);
        friends.add(student3);
        friends.add(student4);
        for (student student5 : friends) {
            System.out.println(student5.toString());
        }

    }
}
