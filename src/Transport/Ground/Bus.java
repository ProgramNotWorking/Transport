package Transport.Ground;

import Transport.Transport;

import java.util.Scanner;

public class Bus extends Transport implements GroundTransport {
    Scanner sc = new Scanner(System.in);

    double fare;
    int maxPeople;
    String trackNumber;

    public Bus(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setFare(double fare) {
        System.out.print("Enter fare per human: ");
        this.fare = sc.nextDouble();
    }

    public void setMaxPeople(int maxPeople) {
        System.out.print("Enter amount of max people places: ");
        this.maxPeople = sc.nextInt();
    }

    public void setTrackNumber(String trackNumber) {
        System.out.print("Enter track number: ");
        this.trackNumber = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.printf("Transport type: %s\n Transport title: %s\n Public: %s\n" +
                "Fare: %s\n How much people can ride: %s\n Track number: %s\n",
                getType(), getName(), isPublic(), fare, maxPeople, trackNumber);
    }

    @Override
    public void isExpensive() {
        if (fare > 50)
            System.out.println("Too expensive for usual bus");
        if (fare < 20)
            System.out.println("Rly? Where are u live?)");
        if (fare < 0)
            System.out.println("Are u sure?");
    }
}
