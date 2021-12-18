import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */
        laliga team = new laliga("Legia Warszawa", "5 Marzec 1916");
        System.out.println(team.toString());
        team team2 = new team("Lech Poznań", "19 Marzec 1922", 65);
        System.out.println(team2.toString());
        List<laliga> footballteam = new ArrayList<>();
        footballteam.add(team);
        footballteam.add(team2);
        System.out.println(footballteam);
        Object team3 = new team("Wisła Kraków", "1906");
        System.out.println(team3.toString());
        Object team4 = new team("Widzew Łódź", "5 listopad 1910", 2.3);
        System.out.println(team4.toString());

    }
}