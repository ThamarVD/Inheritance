public class Worker extends Person{
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int YOB, double hourlyPayRate) {
        super(firstName, lastName, ID, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }

    double calculateWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40){
            return hoursWorked*hourlyPayRate;
        }
        else{
            return (hourlyPayRate * 40) + ((hourlyPayRate*1.5) * (hoursWorked-40));
        }
    }
    String displayWeeklyPay(double hoursWorked){
        if(hoursWorked <= 40){
            return "There was " + hoursWorked + " of regular pay for a total of $" + hoursWorked*hourlyPayRate;
        }
        else{
            return (hourlyPayRate * 40) + " for " + 40 + " of regular pay, and "
                    + ((hourlyPayRate*1.5) * (hoursWorked-40)) + " for " + (hoursWorked-40)
                    + " of overtime for a total of " + ((hourlyPayRate * 40)
                    + ((hourlyPayRate*1.5) * (hoursWorked-40)));
        }
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}
