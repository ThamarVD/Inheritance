public class SalaryWorker extends Worker{
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    double calculateWeeklyPay(double hoursWorked){
        return annualSalary/52.0;
    }

    public String displayWeeklyPay(double hoursWorked){
        return calculateWeeklyPay(hoursWorked) + " is the pay for 1 of 52 weeks from a salary of "
                + annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
