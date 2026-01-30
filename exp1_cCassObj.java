public class Car {
    String brand;
    int year;

    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2021;
        myCar.displayDetails();
    }
}
