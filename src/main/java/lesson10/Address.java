package lesson10;

public class Address {
    private String streetAddress1;
    private String streetAddress2;
    private String city;
    private State state;
    private int zip;

    public Address(String streetAddress1, String streetAddress2, String city, State state, int zip) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
//        return "{" +
//                "street1='" + streetAddress1 + '\'' +
//                ", town='" + city + '\'' +
//                ", state=" + state +
//                ", zip=" + zip +
//                '}';
        return "Private info";
    }
}
