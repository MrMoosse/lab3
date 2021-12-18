public class laliga {
    protected String fullName;
    protected String founded;
    private boolean orTeam;


    public laliga(String fullName, String founded) {
        this.fullName = fullName;
        this.founded = founded;
        orTeam = true;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }


    @Override
    public String toString() {
        return "LaLiga{" +
                "fullName='" + fullName + '\'' +
                ", founded='" + founded + '\'' +
                ", orTeam=" + (orTeam ? "Yes" : "No") +
                '}';
    }
}