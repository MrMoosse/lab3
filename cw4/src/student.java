public class student {
    private osoba osoba;
    private wenum wydzial;

    public student(osoba osoba, wenum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }


    public osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(osoba osoba) {
        this.osoba = osoba;
    }

    public wenum getWydzial() {
        return wydzial;
    }

    public void setWydzial(wenum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return "Student{" + osoba +
                ", wydzial=" + wydzial +
                '}';
    }
}