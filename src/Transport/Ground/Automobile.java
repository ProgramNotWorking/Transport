package Transport.Ground;

import Transport.Transport;

import java.util.Scanner;

public class Automobile extends Transport implements GroundTransport {

    double price;
    double maxSpeed;

    public Automobile(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setPrice(double price) {
        System.out.print("Enter price: ");
        this.price = price;
    }

    public void setMaxSpeed(double maxSpeed) {
        System.out.print("Enter max speed: ");
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Transport type: %s\n Transport title: %s\n Public: %s\n" +
                "Price: %s\n Max speed: %s\n", getType(), getName(), isPublic(), price, maxSpeed);
    }

    @Override
    public void isExpensive() {
        if (price < 40000)
            System.out.println("What is that price?");
        if (price < 0)
            System.out.println("Are u sure?");

        if (price > 750000) {
            System.out.println("This car is pretty expensive");
        } else {
            System.out.println("Affordable price");
        }
    }
}
