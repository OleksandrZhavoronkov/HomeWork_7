package com.example.demo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airline {

    public static void printAirplaneInfo(String aircraftName, String aircraftType) {
        System.out.println( "Are you going to start a war? " + "\n" + "Model Type: " + aircraftType + ", Model Name: " + aircraftName);
    }

    public static void printAirplaneInfo(String aircraftName, String aircraftType, int economyClassPassengers) {
        System.out.println( "Nice Choose! " + "\n" + "Model Type: " + aircraftType + ", Model Name: " + aircraftName + ", Passengers economy class seats: " + economyClassPassengers);
    }

    public static void printAirplaneInfo(String aircraftName, String aircraftType, int economyClassPassengers, int businessClassPassengers) {
        System.out.println( "Elegant Choose! " + "\n" + "Model Type: " + aircraftName + ", Model Name: " + aircraftType + ", Passengers economy class seats: " + economyClassPassengers + ", Passengers business class seats: " + businessClassPassengers);
    }

    public static void main(String[] args) throws IOException {

        //Possibility to read what user enters from the keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Choose your plane according to your needs:" + "\n" + "1 - is Fighter," + "\n" + "2 - is Economy seats Jet," + "\n" + "3 - is Economy seats + Business seats, jet" + "\n" + "Please, enter a corresponding digit to choose:");

        //Creating a variable and assigned a value of the reader
        int number = Integer.parseInt(reader.readLine());

        //if statement implementation here in order to show what is asked in the task
        if (number == 1) {
            Airline.printAirplaneInfo("Mig-29", "Fighter");
        } else if (number == 2) {
            Airline.printAirplaneInfo("Airbus-A320", "Airliner", 120);
        } else if (number == 3) {
            Airline.printAirplaneInfo("Airbus-A380", "Airliner", 120,30);
        } else {
            System.out.println("Please, enter only corresponding numbers");
        }

        //Switch statement in order to train :-)
        /*switch (number) {
            case 1:
                Airline.printAirplaneInfo("Mig-29", "Fighter");
                break;
            case 2:
                Airline.printAirplaneInfo("Airbus-A320", "Airliner", 120);
                break;
            case 3:
                Airline.printAirplaneInfo("Airbus-A380", "Airliner", 120,30);
                break;
            default:
                System.out.println("Please, enter only corresponding numbers");
                break;
        }*/

    }

}