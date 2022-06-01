package Transport.Ground;

import Transport.Transport;

import java.util.Scanner;

public class BicyclesAndMotorcycles extends Transport implements GroundTransport {
    Scanner sc = new Scanner(System.in);

    double maxSpeed;
    double price;

    public BicyclesAndMotorcycles(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setMaxSpeed(double maxSpeed) {
        System.out.print("Enter max speed: ");
        this.maxSpeed = sc.nextDouble();
    }

    public void setPrice(double price) {
        System.out.println("Enter price: ");
        this.price = sc.nextDouble();
    }

    @Override
    public void displayInfo() {
        System.out.printf("Transport type: %s\n Transport type: %s\n Public: %s\n" +
                "Max speed: %s\n Price: %s\n", getType(), getName(), isPublic(), maxSpeed, price);
    }

    @Override
    public void isExpensive() {
        if (getType().equalsIgnoreCase("велосипед")) {
            if (price < 0)
                System.out.println("Are u sure?");
            else if (price > 10000)
                System.out.println("Too expensive");
            else
                System.out.println("Normal price");
        }
    }
}
