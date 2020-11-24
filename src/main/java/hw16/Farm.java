package hw16;

import java.util.List;
import java.util.Map;

public class Farm {

    private String name;
    private Address16 address;
    private Map<Cattle,Integer> cattle;
    private List<AgreeCultural> agreeCultural;


    public Farm(String name, Address16 address, Map<Cattle, Integer> cattle, List<AgreeCultural> agreeCultural) {
        this.name = name;
        this.address = address;
        this.cattle = cattle;
        this.agreeCultural = agreeCultural;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address16 getAddress() {
        return address;
    }

    public void setAddress(Address16 address) {
        this.address = address;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getAgreeCultural() {
        return agreeCultural;
    }

    public void setAgreeCultural(List<AgreeCultural> agreeCultural) {
        this.agreeCultural = agreeCultural;
    }

    public void printInfo() {
        System.out.println("Farm name is " + name);
        address.printAddress();
        System.out.println("Cattle is " + cattle);
        System.out.println("Fields with cultural");
        agreeCultural.forEach(element -> element.printInfo());
    }
}
