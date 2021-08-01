package case_study.task2.models;

public class House extends Facility {
    private String standardRoom;
    private int numberOfFloors;

    public House() {
    }

    public House(String standardRoom, int numberOfFloors) {
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String name, Float area, double price, int amount, String typeRents, String standardRoom, int numberOfFloors) {
        super(name, area, price, amount, typeRents);
        this.standardRoom = standardRoom;
        this.numberOfFloors = numberOfFloors;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "standardRoom='" + standardRoom + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}' + ", which is a subclass of " +
                super.toString();
    }
}
