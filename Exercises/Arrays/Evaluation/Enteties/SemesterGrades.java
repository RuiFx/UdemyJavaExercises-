package Evaluation.Enteties;

public class SemesterGrades {
    private double firstGrade;
    private double secondGrade;
    private double averageGrade;

    public SemesterGrades(int firstGrade, int secondGrade){
        this.firstGrade = firstGrade;
        this.secondGrade = secondGrade;
    }

    public SemesterGrades() {
    }

    public double getFirstGrade() {
        return firstGrade;
    }

    public void setFirstGrade(double firstGrade) {
        this.firstGrade = firstGrade;
    }

    public double getSecondGrade() {
        return secondGrade;
    }

    public void setSecondGrade(double secondGrade) {
        this.secondGrade = secondGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }
}
