public class Address {
    private String street1, street2, city, state;
    private int zip;

    public Address(String street1, int zip, String city, String state){
        this.street1 = street1;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }
    public Address(String street1, String street2, int zip, String city, String state){
        this.street1 = street1;
        this.street2 = street2;
        this.zip = zip;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString(){
        if(street2 == null) return street1 + "\n" + zip + " " + city + ", " + state + "";
        else return street1 + "\n" + street2 + "\n" + zip + " " +city+ "," + state + "";
    }
}
