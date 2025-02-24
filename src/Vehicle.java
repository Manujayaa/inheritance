public class Vehicle {
    String make;
    String model;
    String color;
    int speed;

    //Default constructor
    public Vehicle() {
    }

    public Vehicle(String make,String model,String color,int speed){
        this.make = make;
        this.model = model;
        this.color = color;
        this.speed = 0;
        System.out.println("vecle created");
    }

    public Vehicle(String make, String model, String color) {
    }

    public void accelarate(){
        System.out.println("the vehicle is speed up");
        this.speed +=5;
    }
    public  void brake(){
        System.out.println("vehicle is slow down");
        this.speed-=5;
    }
    public  void turn(String direction){
        System.out.println("Turning " +direction);
    }

    public  int getSpeed(){
        return speed;
    }


}
