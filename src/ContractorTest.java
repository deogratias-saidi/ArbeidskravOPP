import java.time.LocalDate;
import java.util.ArrayList;

public class ContractorTest {
    public static void main(String [] args){
        Address client1 = new Address("Rastafaret 12", 1476, "Rasta", "Viken");
        Address client2 = new Address("Hasleb", 0421, "Oslo", "Oslo");

        LocalDate start1 = LocalDate.parse("2020-02-02");
        LocalDate end1 = LocalDate.parse("2020-11-02");
        Project project1 = new Project("Bolig", "Ibrahim Jusu", client1, start1, end1);

        LocalDate start2 = LocalDate.parse("2020-10-03");
        LocalDate end2 = LocalDate.parse("2020-11-02");
        Project project2 = new Project("Skole", "Oslo Skole", client2, start2, end2);

        Address eAddress = new Address("Lysaker Torg 5", 1346, "Lysaker", "Viken");
        Address cAddress = new Address("Lysaker Torg 10", 1348, "Lysaker", "Viken");
        Address pAddress = new Address("Lysaker Torg 15", 1350, "Lysaker", "Viken");

        Worker e = new Electrician("Lionel", "Messi", eAddress, 001, 30, 40);
        Worker c = new Carpenter("Mohammed", "Salah", cAddress, 002, 25, 35);
        Worker p = new Plumber("Eden", "Hazard", pAddress, 003, 23, 34);

        ArrayList<Worker> workers = new ArrayList<>();

        workers.add(e);
        workers.add(c);
        workers.add(p);
        ((Electrician)e).setWiringCost(400);
        ((Carpenter)c).setLumberCost(600);
        ((Plumber)p).setPlumbingCost(1000);
        project1.addWorkers(workers);
        project1.setOverhead(.18);

        System.out.printf(project1.toString(), project1.getName(), project1.getTotalCost(), project1.getOverhead());
        System.out.println("=================================\n");

        workers.remove(p);
        workers.remove(c);
        ((Electrician)e).setWiringCost(200);
        workers.get(0).setHoursWorked(20);
        project2.addWorkers(workers);
        System.out.printf(project2.toString(),project2.getName(), project2.getTotalCost(), project2.getOverhead());

        if(project2.compareTo(project1) < 0){
            System.out.println("\nThe " + project2.getName() + " project is scheduled before " + project1.getName());
        }else{
            System.out.println("\nThe " + project1.getName() + " project is scheduled before " + project2.getName());
        }
        System.out.println("\n");
        project1.printPayroll();
    }
}
