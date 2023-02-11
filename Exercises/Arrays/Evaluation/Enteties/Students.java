package Evaluation.Enteties;

public class Students {

    private String name;
    SemesterGrades grades = new SemesterGrades();
    public Students(String name, double firstGrade, double secondGrade) {
        this.name = name;
        grades.setFirstGrade(firstGrade);
        grades.setSecondGrade(secondGrade);
        grades.setAverageGrade((firstGrade + secondGrade)/2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageGrade() {
        return grades.getAverageGrade();
    }

}
