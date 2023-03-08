package entities;

public class Company extends TaxPayer{

    private Integer numberOfEmployees;

    public Company() {
    }

    public Company(String name, Double incomeValue, Integer numberOfEmployees) {
        super(name, incomeValue);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax = 0.00;
        Double annualIncome = getAnnualIncome();
        if (numberOfEmployees > 10) {
            tax = annualIncome * 0.14;
        } else {
            tax = annualIncome * 0.16;
        }
        return tax;
    }
}
