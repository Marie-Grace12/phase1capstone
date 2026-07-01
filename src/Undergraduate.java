public class Undergraduate extends Student{

    private double midTermGrade;
    private double finalExamGrade;
    private double average;
    public Undergraduate(String name, String userName, int id,double midTermGrade,double finalExamGrade,double average) {
        super(name, userName, id);
        this.midTermGrade=midTermGrade;
        this.finalExamGrade=finalExamGrade;
        this.average=average;
    }

    @Override
    public double calculateGPA() { double average=(midTermGrade+finalExamGrade)/2;
        return (average/100)*4.0;
    }

    public double getMidTermGrade() {
        return midTermGrade;
    }

    public void setMidTermGrade(double midTermGrade) {
        this.midTermGrade = midTermGrade;
    }

    public double getFinalExamGrade() {
        return finalExamGrade;
    }

    public void setFinalExamGrade(double finalExamGrade) {
        this.finalExamGrade = finalExamGrade;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}









