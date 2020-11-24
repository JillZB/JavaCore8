package homeworkND8;

public class Jobs {
    private String name;
    private String nameOrganization;
    private int year;

    public Jobs(String name, String nameOrganization, int year){
        this.name = name;
        this.nameOrganization = nameOrganization;
        this.year = year;
    }
    public Jobs(){}


    public void setName(String name){
        this.name = name;

    }
    public String getName(){
        return name;
    }
    public void setNameOrganization(String nameOrganization){
        this.nameOrganization = nameOrganization;
    }
    public String getNameOrganization(){
        return nameOrganization;
    }
    public void setYear(int year){
        if(year<1999 || year>2021){
            throw new IllegalArgumentException("Wrong year");
        }
        this.year = year;


    }
    public int getYear(){
        return year;
    }

}
