package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
            System.out.println("Enter temperature in F");

                int tempInF = in.nextInt();

                System.out.print("The temperature in Celsius is ");
                System.out.printf("%.2f", convertToCelsius(tempInF));
                System.out.println("°");
                System.out.println(getMessage(tempInF));

                String entry = "";
                while (!entry.equalsIgnoreCase("n")) {
                System.out.println("Would you like to enter another temperature Y(yes) or N(no): ");

                entry = in.next();
                if(!entry.equalsIgnoreCase("n")) {
                    System.out.println("Enter a temperature");
                    tempInF = in.nextInt();

                    System.out.print("The temperature in Celsius is ");
                    System.out.printf("%.2f", convertToCelsius(tempInF));
                    System.out.println("°");
                    System.out.println(getMessage(tempInF));
                }
                }
    }
    public static double convertToCelsius(int tempInF){
        double tempInC = (tempInF - 32) *.5556;
        return tempInC;
    }

    public static String getMessage(int tempinF) {
        String message = "";

        ArrayList<String>colors = new ArrayList <>();
        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("orange");
        ArrayList<String>drinks = new ArrayList<>();
        drinks.add("pumpkin spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");
        Random rand = new Random();
        Random rand2 = new Random();

        int colorIndex = rand.nextInt(colors.size()-1);
        int drinkIndex = rand2.nextInt(drinks.size()-1);

        if (tempinF < 45) {
            message = "The weather is a bit chilly for fall.";
        } else if (tempinF > 70) {
            message = "The weather is a bit warm for fall.";
        } else {
            String oneColor = colors.get(colorIndex);//gets random color
            String oneDrink = drinks.get(drinkIndex);
            System.out.println("Today's weather is a perfect fall day for a cup of " + oneDrink + ".");
            System.out.println("The color of the leaves are " + oneColor + ".");
            //for some reason, I cannot use return oneDrink; and return oneColor; together??
        }
        return message;
    }
}
