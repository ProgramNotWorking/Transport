package Transport.Ground;

import Transport.Transport;

import java.util.Scanner;

public class MilitaryEnginery extends Transport implements GroundTransport {
    Scanner sc = new Scanner(System.in);

    String militaryType;

    public MilitaryEnginery(String type, String name, boolean isPublic) {
        super(type, name, isPublic);
    }

    public void setMilitaryType(String militaryType) {
        System.out.print("Enter type: ");
        this.militaryType = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.printf("Transport type: %s\n Transport type: %s\n Public: %s\n" +
                "Type of this freaking transport: %s", getType(), getName(), isPublic(), militaryType);
    }

    @Override
    public void isExpensive() {
        System.out.println("How do u know?)");
    }
}
