public class Electrician extends Worker {
    private double wiringCost = 0.0;
    public Electrician(String firstName, String lastName, Address address, int idNumber, double hour, double rate) {
        super(firstName, lastName, address, idNumber, hour, rate);
    }
    public void setWiringCost(double amount){
        wiringCost = amount;
    }
    public String doWork(){
        return "Install electrical components";
    }
    @Override
    public String toString(){
        return "Electrician: " + super.toString() + "\n" + doWork();
    }
    public double calculatePay(){
        return hoursWorked * hourlyRate + wiringCost;
    }
}
