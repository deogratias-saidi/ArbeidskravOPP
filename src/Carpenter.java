public class Carpenter extends Worker {
    private double lumberCosts = 0.0;
    public Carpenter(String firstName, String lastName, Address address, int idNumber, double hour, double rate) {
        super(firstName, lastName, address, idNumber, hour, rate);
    }
    public void setLumberCost(double amount){
        lumberCosts = amount;
    }
    public String doWork(){
        return "Complete carpentry work";
    }
    @Override
    public String toString(){
        return "Carpenter: " + super.toString() + "\n" + doWork();
    }
    public double calculatePay(){
        return hoursWorked * hourlyRate + lumberCosts;
    }
}
