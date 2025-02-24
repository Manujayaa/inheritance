public class Car extends Vehicle {
    int seaPosition;

    public Car() {
        super();
    }

    public Car(String make, String model, String color) {
        super(make,model,color);

        this.seaPosition = 0;
        System.out.println("car is created.");
    }
    public void adjustSeat(int adjustment) {
        this.seaPosition += adjustment;

        if(adjustment > 0) {
            System.out.println("Moving seat forward...");
        }
        else if(adjustment < 0) {
            System.out.println("Moving seat backward...");
        }
        else {
            System.out.println("Seat position not changed.");
        }
    }
}