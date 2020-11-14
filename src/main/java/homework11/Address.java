package homework11;

public class Address {
    private String streetAddress1;
    private String streetAddress2;
    private String City;
    private String State;
    private int zip;

    public Address(String streetAddress1, String streetAddress2, String city, String state, int zip) {
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        City = city;
        State = state;
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
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
}
