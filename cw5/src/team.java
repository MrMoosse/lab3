public class team extends laliga {
    protected double budget;


    public team(String fullName, String founded, double budget) {
        super(fullName, founded);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Team{" +
                super.toString() +
                ", budget=" + budget +
                '}';
    }


}