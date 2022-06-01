import Transport.Air.AirBalloon;
import Transport.Air.Airplane;
import Transport.Ground.Automobile;
import Transport.Ground.BicyclesAndMotorcycles;
import Transport.Ground.Bus;
import Transport.Ground.MilitaryEnginery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String groundOrAir = inputType();

        if (groundOrAir.equalsIgnoreCase("Наземный транспорт")) {

            System.out.print("Enter what it specifically: ");
            String transportType = sc.nextLine();

            if (transportType.equalsIgnoreCase("Автомобиль")) {

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

                double price = 0;
                double maxSpeed = 0;

                Automobile automobile = new Automobile(type, name, isPublic);
                automobile.setPrice(price);
                automobile.setMaxSpeed(maxSpeed);

                automobile.displayInfo();
                automobile.isExpensive();

            } else if (transportType.equalsIgnoreCase("Автобус")) {

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

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

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

                String militaryType = "";

                MilitaryEnginery militaryEnginery = new MilitaryEnginery(type, name, isPublic);
                militaryEnginery.setMilitaryType(militaryType);

                militaryEnginery.displayInfo();
                militaryEnginery.isExpensive();

            } else if (transportType.equalsIgnoreCase("Мотоцикл")
                    || transportType.equalsIgnoreCase("Велосипед")) {

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

                double maxSpeed = 0;
                double price = 0;

                BicyclesAndMotorcycles bicyclesAndMotorcycles = new BicyclesAndMotorcycles(type, name, isPublic);
                bicyclesAndMotorcycles.setMaxSpeed(maxSpeed);
                bicyclesAndMotorcycles.setPrice(price);

                bicyclesAndMotorcycles.displayInfo();
                bicyclesAndMotorcycles.isExpensive();

            }

        } else if (groundOrAir.equalsIgnoreCase("Воздушный транспорт")) {

            String transportType = sc.nextLine();

            if (transportType.equalsIgnoreCase("Самолет")) {

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

                double maxPeople = 0;
                boolean isMilitary = false;

                Airplane airplane = new Airplane(type, name, isPublic);
                airplane.setMaxPeople(maxPeople);
                airplane.setMilitary(isMilitary);

                airplane.displayInfo();
                airplane.isMilitary();

            } else if (transportType.equalsIgnoreCase("Воздушный шар")) {

                String type = inputTransportType();
                String name = inputTransportName();
                boolean isPublic = inputPublicOrNot();

                double price = 0;
                int maxPeople = 0;
                boolean isMilitary = false;

                AirBalloon airBalloon = new AirBalloon(type, name, isPublic);
                airBalloon.setPrice(price);
                airBalloon.setMaxPeople(maxPeople);
                airBalloon.setMilitary(isMilitary);

                airBalloon.displayInfo();
                airBalloon.isMilitary();

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