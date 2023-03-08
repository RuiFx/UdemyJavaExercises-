package entities;

public class Individual extends TaxPayer {

    private Double healthExpenditures;

    public Individual() {
    }

    public Individual(String name, Double incomeValue, Double healthExpenditures) {
        super(name, incomeValue);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax = 0.00;
        double annualIncome = getAnnualIncome();
        if (annualIncome <= 20000.00) {
            tax = annualIncome * 0.15;
            if (healthExpenditures > 0) {
                tax -= healthExpenditures / 2;
            }
        } else if (annualIncome > 20000.00) {
            tax = annualIncome * 0.25;
            if (healthExpenditures > 0) {
                tax -= healthExpenditures / 2;
            }
        }
        return tax;
    }
}
