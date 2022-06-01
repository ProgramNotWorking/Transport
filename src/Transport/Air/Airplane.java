package Transport.Air;

import Transport.Transport;

public class Airplane extends Transport implements AirTransport {

    double maxPeople;
    boolean isMilitary;

    public Airplane(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setMaxPeople(double maxPeople) {
        System.out.print("Enter max people places: ");
        this.maxPeople = maxPeople;
    }

    public void setMilitary(boolean military) {
        System.out.println("Enter military or not");    //TODO: Grammar enter to this ind another
        this.isMilitary = isMilitary;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Type: %s\n Title: %s\n Public: %s\n" +
                "How much people can place: %s\n", getType(), getName(), isPublic(),
                maxPeople);
    }

    @Override
    public void isMilitary() {
        if (isMilitary)
            System.out.println("This plane is military");
        else {
            System.out.println("This plane is ");
            System.out.println(isPublic() ? "public" : "private");
        }
    }
}
