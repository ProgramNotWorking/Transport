package Transport.Air;

import Transport.Transport;

import java.util.Scanner;

public class Airplane extends Transport implements AirTransport {
    Scanner sc = new Scanner(System.in);

    double maxPeople;
    boolean isMilitary;

    public Airplane(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setMaxPeople(double maxPeople) {
        System.out.print("Enter max people places: ");
        this.maxPeople = sc.nextDouble();
    }

    public void setMilitary(boolean isMilitary) {
        System.out.println("Enter military or not");

        String military = sc.nextLine();

        if (military.equalsIgnoreCase("Да"))
            this.isMilitary = true;
        else if (military.equalsIgnoreCase("Нет"))
            this.isMilitary = false;

    }

    @Override
    public void displayInfo() {
        System.out.printf("Type: %s\n Title: %s\n Public: %s\n" +
                "How much people can place: %s\n", getType(), getName(), isPublic(), maxPeople);
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
