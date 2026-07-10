public class Graduate extends Student{
    private double thesisScore;
    public Graduate(String name, String userName, int id,double thesisScore) {
        super(name, userName);
        this.thesisScore=thesisScore;
    }

    public double getThesisScore() {
        return thesisScore;
    }

    public void setThesisScore(double thesisScore) {
        this.thesisScore = thesisScore;
    }

    @Override
    public double calculateGPA() {
        return (thesisScore/100)*4.0;
    }
}
