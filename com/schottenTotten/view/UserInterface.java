package com.schottenTotten.view;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.schottenTotten.controller.Color;


public class UserInterface {

    public static Scanner scanner = new Scanner(System.in);

    public static void displayBanner() {
        System.out.println( "\t/~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\\"); 
        System.out.println( "\t|                               |");
        System.out.print("\t|");
        ColoredText.printColored("  Welcome to Schotten-Totten!  ", ColoredText.getColoredString(Color.RED));
        System.out.println("|");
        System.out.println( "\t|                               |");
        System.out.println("\t\\~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~/");
    }

    public static void displayMainMenu() {
        ColoredText.clear();
        displayBanner();
        
        System.out.println();
        System.out.println("Choose an option: ");
        System.out.print("[1] ");
        ColoredText.printlnColored("Start Game", ColoredText.getColoredString(Color.RED));

        System.out.print("[2] ");
        ColoredText.printlnColored("Exit", ColoredText.getColoredString(Color.RED));

        System.out.println();

        System.out.print("Enter your choice (1 or 2): ");
    }

    public static void displayStartScreen() {
        ColoredText.clear();
        UserInterface.displayBanner();
        System.out.println(); 

        System.out.println("Choose your game mode: ");
        System.out.print("[1] ");
        ColoredText.printColored("Classic Mode", ColoredText.getColoredString(Color.RED));
        System.out.println(" | The traditional gameplay.");
        System.out.print("[2] ");
        ColoredText.printColored("Tactical Variant", ColoredText.getColoredString(Color.RED));
        System.out.println(" | Play with Tactical Cards!");

        System.out.println(); 

        System.out.print("Enter your choice (1 or 2): ");
    }

    public static void displayAIPick() {
        ColoredText.clear();
        UserInterface.displayBanner();
        System.out.println();

        System.out.println("Do you want to play against an AI?");
        System.out.println("[1] Yes");
        System.out.println("[2] No");

        System.out.println();

        System.out.print("Enter your choice (1 or 2): ");
    }

    public static String askPlayerName(String player) {
        System.out.print("Enter your name (" + player + "): ");
        return scanner.next();
    }

    public static int pick_menu() {
        displayMainMenu();

        int choice = -1;

        while (choice != 1 && choice != 2) {
            try {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    ColoredText.clear();
                    displayMainMenu();
                }
            } catch (InputMismatchException e) {
                scanner.next(); // Clear the invalid input
                ColoredText.clear();
                displayMainMenu();
            }
        }

        return choice; 
    }

    public static int pick_variant() {
        displayStartScreen();
        int choice = -1;
        while (choice != 1 && choice != 2) {
            try {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    ColoredText.clear();
                    displayStartScreen();
                }
            } catch (InputMismatchException e) {
                scanner.next(); // Clear the invalid input
                ColoredText.clear();
                displayStartScreen();
            }
        }
        return choice;
    }

    public static int pick_ai() {
        displayAIPick();
        int choice = -1;
        while (choice != 1 && choice != 2) {
            try {
                choice = scanner.nextInt();
                if (choice != 1 && choice != 2) {
                    ColoredText.clear();
                    displayAIPick();
                }
            } catch (InputMismatchException e) {
                scanner.next(); // Clear the invalid input
                ColoredText.clear();
                displayAIPick();
            }
        }
        return choice;
    }

    public static int which_deck() {
        System.out.println("From which deck do you want to pick your card ?");
        System.out.println("[1] Classic Deck");
        System.out.println("[2] Tactical Deck");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = -1;
        while (choice != 1 && choice != 2) {
            choice = scanner.nextInt();
            if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice. Please choose a valid deck.");
            }
        }
        return choice;
    }

    public static void close() {
        scanner.close();
    }
}