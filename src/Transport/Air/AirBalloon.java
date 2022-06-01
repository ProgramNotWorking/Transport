package Transport.Air;

import Transport.Transport;

import java.util.Scanner;

public class AirBalloon extends Transport implements AirTransport {
    Scanner sc = new Scanner(System.in);

    double price;
    int maxPeople;
    boolean isMilitary;

    public AirBalloon(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setPrice(double price) {
        System.out.print("Enter price: ");
        this.price = sc.nextDouble();
    }

    public void setMaxPeople(int maxPeople) {
        System.out.print("Enter how much people can ride then: ");
        this.maxPeople = sc.nextInt();
    }

    public void setMilitary(boolean isMilitary) {
        System.out.print("Is that military: ");
        String military = sc.nextLine();
        if (military.equalsIgnoreCase("Да"))
            this.isMilitary = true;
        else if (military.equalsIgnoreCase("Нет"))
            this.isMilitary = false;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Type: %s\n Title: %s\n Public: %s\n" +
            "Price: %s\n How much people can ride: %s\n", getType(), getName(), isPublic(),
                price, maxPeople);
    }

    @Override
    public void isMilitary() {
        if (isMilitary)
            System.out.println("This balloon can use all people");
        else {
            System.out.println("This balloon is ");
            System.out.println(isMilitary ? "public" : "private");
        }
    }
}
