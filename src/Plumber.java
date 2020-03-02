public class Plumber extends Worker {
    private double plumbingMaterials = 0.0;
    public Plumber(String firstName, String lastName, Address address, int idNumber, double hour, double rate) {
        super(firstName, lastName, address, idNumber, hour, rate);
    }
    public void setPlumbingCost(double amount){
        plumbingMaterials = amount;
    }
    public String doWork(){
        return "Install plumbing";
    }
    @Override
    public String toString(){
        return "Plumber: " + super.toString() + "\n" + doWork();
    }
    public double calculatePay(){
        return hoursWorked * hourlyRate + plumbingMaterials;
    }
}
