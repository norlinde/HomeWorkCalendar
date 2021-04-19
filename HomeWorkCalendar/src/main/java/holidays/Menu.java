package holidays;

import java.util.Scanner;

public class Menu {
    Holiday newYearsEve = new Holiday("January", "New Year's Day", "1th of January");
    Holiday goodFriday = new Holiday("April", "Good Friday", "2nd of April");
    Holiday easterMonday = new Holiday("April", "Easter Monday", "5th of April");
    Holiday labourDay = new Holiday("May", "Labour Day", "1th of May");
    Holiday independenceRestorationDay = new Holiday("May", "Independence Restoration Day", "5th of May");
    Holiday midsummerEve = new Holiday("June", "Midsummer's Eve", "23rd of June");
    Holiday stJohnDay = new Holiday("June", "St John's Day", "24th of June");
    Holiday independenceDay = new Holiday("November", "Independence Day", "18th of November");
    Holiday christmasEve = new Holiday("December", "Christmas Eve", "24th of December");
    Holiday christmasDay = new Holiday("December", "Christmas Day", "25th of December");
    Holiday anotherChristmasDay = new Holiday("December", "2nd Day of Christmas", "26th of December");
    Holiday newYearEveDec = new Holiday("December", "New Year's Eve", "31th of December");

    public String holidaysInJan() {
        return "\n" + this.newYearsEve.name + " - " + this.newYearsEve.date;
    }

    public String holidaysInApril() {
        return "\n" + this.goodFriday.name + " - " + this.goodFriday.date +
                "\n" + this.easterMonday.name + " - " + this.easterMonday.date;
    }

    public String holidaysInMay() {
        return "\n" + this.labourDay.name + " - " + this.labourDay.date +
                "\n" + this.independenceRestorationDay.name + " - " + this.independenceRestorationDay.date;
    }

    public String holidaysInJune() {
        return "\n" + this.midsummerEve.name + " - " + this.midsummerEve.date +
                "\n" + this.stJohnDay.name + " - " + this.stJohnDay.date;
    }

    public String holidaysInNov() {
        return "\n" + this.independenceDay.name + " - " + this.independenceDay.date;
    }

    public String holidaysInDec() {
        return "\n" + this.christmasEve.name + " - " + this.christmasEve.date +
                "\n" + this.christmasDay.name + " - " + this.christmasDay.date +
                "\n" + this.anotherChristmasDay.name + " - " + this.anotherChristmasDay.date +
                "\n" + this.newYearEveDec.name + " - " + this.newYearEveDec.date;

    }

}









