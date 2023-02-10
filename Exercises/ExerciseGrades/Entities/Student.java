package Entities;

public class Student {

    public double firstQuarter, secondQuarter, thirdQuarter, finalGrade;
    public String name;

    public double FinalGrade(){
        finalGrade = firstQuarter + secondQuarter + thirdQuarter;
        return finalGrade;
    }

    public void Qualification(){
        double minimumGrade = 60.00;
        if (finalGrade >= 60.00){
            System.out.printf("Congratulations, you passed with %.2f points.", finalGrade);
        } else {
            System.out.printf("I'm sorry %s, but, you failed, missing %.2f points to pass", name, minimumGrade - finalGrade);
        }
    }
}
