import java.rmi.NoSuchObjectException;

public class osoba {
    private String Imie, Nazwisko;
    private Integer indeks;

    public osoba(String imie, String nazwisko, Integer indeks) {
        Imie = imie;
        Nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String imie) {
        Imie = imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        Nazwisko = nazwisko;
    }

    public Integer getIndeks() {
        return indeks;
    }

    public void setIndeks(Integer indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return
                "Imie='" + Imie + '\'' +
                        ", Nazwisko='" + Nazwisko + '\'' +
                        ", indeks=" + indeks +
                        '}';
    }
}