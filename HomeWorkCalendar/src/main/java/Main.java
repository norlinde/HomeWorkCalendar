import holidays.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }

    void showMenu() {
        String userInput = "";

        do {
            System.out.println("WELCOME!");
            System.out.println("\nYou are in the CALENDAR. Here you can search holidays by months.");

            System.out.println(
                    "\n1. January\t\t\t" + "4. April\t\t" + "7. July\t\t\t\t" + "10. October\n" +
                     "2. February\t\t\t" + "5. May\t\t\t" + "8. August\t\t\t" + "11. November\n" +
                     "3. March\t\t\t" + "6. June\t\t\t" + "9. September\t\t" + "12. December\n");

            System.out.println("\n13. View All Holidays");
            System.out.println("14. Exit");

            System.out.print("\nChose the month and type here the number:  ");
            userInput = scanner.nextLine();

            switch (userInput) {
                case "14":
                    System.out.println("\nHave a great day!");
                    break;
                case "1":
                    holidaysInJan();
                    break;
                case "4":
                    holidaysInApril();
                    break;
                case "5":
                    holidaysInMay();
                    break;
                case "6":
                    holidaysInJune();
                    break;
                case "11":
                    holidaysInNov();
                    break;
                case "12":
                    holidaysInDec();
                    break;
                case "13":
                    getAllHolidays();
                    break;
                case "2":
                case "3":
                case "7":
                case "8":
                case "9":
                case "10":
                    noHolidays();
                    break;
                default:
                    break;
            }
            System.out.print("\n Enter C to continue\n");
            scanner.nextLine();
        }
        while (!userInput.equals("14"));
        return;
    }

    void holidaysInJan() {
        Menu menu = new Menu();
        String message = menu.holidaysInJan();
        System.out.print("\nHolidays in January: ");
        System.out.print(message+"\n");
    }

    void holidaysInApril() {
        Menu menu = new Menu();
        String message = menu.holidaysInApril();
        System.out.print("\nHolidays in April: ");
        System.out.print(message+"\n");
    }

    void holidaysInMay() {
        Menu menu = new Menu();
        String message = menu.holidaysInMay();
        System.out.print("\nHolidays in May: ");
        System.out.print(message+"\n");
    }

    void holidaysInJune() {
        Menu menu = new Menu();
        String message = menu.holidaysInJune();
        System.out.print("\nHolidays in June: ");
        System.out.print(message+"\n");
    }

    void holidaysInNov() {
        Menu menu = new Menu();
        String message = menu.holidaysInNov();
        System.out.print("\nHolidays in November: ");
        System.out.print(message+"\n");
    }

    void holidaysInDec() {
        Menu menu = new Menu();
        String message = menu.holidaysInDec();
        System.out.print("\nHolidays in December: ");
        System.out.print("\n"+message+"\n");
    }

    void getAllHolidays() {
        Menu menu = new Menu();
        String message = menu.holidaysInJan();
        String message2 = menu.holidaysInApril();
        String message3 = menu.holidaysInMay();
        String message4 = menu.holidaysInJune();
        String message5 = menu.holidaysInNov();
        String message6 = menu.holidaysInDec();
        System.out.println("\nHolidays in 2021 " + "\n" + message + message2 + message3 + message4 + message5 + message6);
    }

    void noHolidays() {
        System.out.println("\nIn this Months there are NO HOLIDAYS");
    }
}











