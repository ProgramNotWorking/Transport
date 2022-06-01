package Transport.Air;

import Transport.Transport;

public class AirBalloon extends Transport implements AirTransport {

    double price;
    int maxPeople;
    boolean isMilitary;

    public AirBalloon(String type, String name, boolean isPublic, double price, int maxPeople, boolean isMilitary) {
        super(type, name, isPublic);
        this.price = price;
        this.maxPeople = maxPeople;
        this.isMilitary = isMilitary;
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
