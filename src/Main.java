import Transport.Air.AirTransport;
import Transport.Air.Airplane;
import Transport.Ground.Automobile;
import Transport.Ground.BicyclesAndMotorcycles;
import Transport.Ground.Bus;
import Transport.Ground.MilitaryEnginery;
import Transport.Transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (inputType().equalsIgnoreCase("Наземный транспорт")) {

            String transportType = sc.nextLine();

            String type = inputTransportType();
            String name = inputTransportName();
            boolean isPublic = inputPublicOrNot();

            if (transportType.equalsIgnoreCase("Автомобиль")) {

                double price = 0;
                double maxSpeed = 0;

                Automobile automobile = new Automobile(type, name, isPublic);
                automobile.setPrice(price);
                automobile.setMaxSpeed(maxSpeed);

                automobile.displayInfo();
                automobile.isExpensive();

            } else if (transportType.equalsIgnoreCase("Автобус")) {

                double fare = 0;
                int maxPeople = 0;
                String trackNumber = "";

                Bus bus = new Bus(type ,name ,isPublic);
                bus.setFare(fare);
                bus.setMaxPeople(maxPeople);
                bus.setTrackNumber(trackNumber);

                bus.displayInfo();
                bus.isExpensive();

            } else if (transportType.equalsIgnoreCase("Военная техника")) {

                String militaryType = "";

                MilitaryEnginery militaryEnginery = new MilitaryEnginery(type, name, isPublic);
                militaryEnginery.setMilitaryType(militaryType);

                militaryEnginery.displayInfo();
                militaryEnginery.isExpensive();

            } else if (transportType.equalsIgnoreCase("Мотоцикл")
                    || transportType.equalsIgnoreCase("Велосипед")) {

                double maxSpeed = 0;
                double price = 0;

                BicyclesAndMotorcycles bicyclesAndMotorcycles = new BicyclesAndMotorcycles(type, name, isPublic);
                bicyclesAndMotorcycles.setMaxSpeed(maxSpeed);
                bicyclesAndMotorcycles.setPrice(price);

                bicyclesAndMotorcycles.displayInfo();
                bicyclesAndMotorcycles.isExpensive();

            }

        } else if (inputType().equalsIgnoreCase("Воздушный транспорт")) {

            String transportType = sc.nextLine();

            String type = inputTransportType();
            String name = inputTransportName();
            boolean isPublic = inputPublicOrNot();

            if (transportType.equalsIgnoreCase("Самолет")) {

                double maxPeople = 0;
                boolean isMilitary = false;

                Airplane airplane = new Airplane(type, name, isPublic);


            }

        }

    }

    static String inputType() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter transport type: ");
        return sc.nextLine();
    }

    static String inputTransportType() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type: ");
        return sc.nextLine();
    }

    static String inputTransportName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        return sc.nextLine();
    }

    static boolean inputPublicOrNot() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter public or not: ");
        boolean isPublic = false;
        String publicOrNot = sc.nextLine();
        if (publicOrNot.equalsIgnoreCase("Да"))
            isPublic = true;
        else if (publicOrNot.equalsIgnoreCase("Нет"))
            isPublic = false;
        return isPublic;
    }
}