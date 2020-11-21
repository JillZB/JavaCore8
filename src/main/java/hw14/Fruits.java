package hw14;

public class Fruits {
    private String type;
    private int count;

    public Fruits(){

    }

    public Fruits(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "type='" + type + '\'' +
                ", count=" + count +
                '}';
    }
}