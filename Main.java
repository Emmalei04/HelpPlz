
import java.util.Scanner;

public class Main {
    static String[][] january = new String[31][];
    static String[][] february = new String[28][];
    static String[][] march = new String[31][];
    static String[][] april = new String[30][];
    static String[][] may = new String[31][];
    static String[][] june = new String[30][];
    static String[][] july = new String[31][];
    static String[][] august = new String[31][];
    static String[][] september = new String[30][];
    static String[][] november = new String[30][];
    static String[][] december = new String[31][];

    public static String addEvent(String newEvent){
        Scanner scnr = new Scanner(System.in);
        String month;
        int day;
        int i = 0;
        int j = 0;
        char nextChoice;
        String testStringWorking = "This method is working";
        String testStringFailing = "This method is failing";

        System.out.println("What month would you like to add this event to?");
        month = scnr.next().toUpperCase();

        if(month.equals("JANUARY")){
            System.out.println("What day would you like to add your event to?");
            day = scnr.nextInt();

            for(i = 0; i < january.length; i++){
                if(january[day - 1][i] == null){
                    january[day][i] = newEvent;
                    System.out.println("Event Added");
                    System.out.println("What would you like to do next?");
                    nextChoice = scnr.next().charAt(0);
                    menu(nextChoice);
                    break;

                }
            }


            return testStringWorking;
        } else if(month.equals("FEBRUARY")){
            return testStringWorking;
        } else if(month.equals("MARCH")){
            return testStringWorking;
        }else if(month.equals("APRIL")){
            return testStringWorking;
        } else if(month.equals("MAY")){
            return testStringWorking;
        } else if(month.equals("JUNE")){
            return testStringWorking;
        } else if(month.equals("JULY")){
            return testStringWorking;
        } else if(month.equals("AUGUST")){
            return testStringWorking;
        } else if(month.equals("NOVEMBER")){
            return testStringWorking;
        } else if(month.equals("DECEMBER")){
            return testStringWorking;
        }

        return testStringFailing;
    }

    public static void removeEvent(){
        Scanner scnr = new Scanner(System.in);
        String month;
        int day;
        char nextChoice;
        String testStringWorking = "This method is working";
        String testStringFailing = "This method is failing";

        System.out.println("What month would you like to add this event to?");
        month = scnr.next().toUpperCase();

        if(month.equals("JANUARY")){
            System.out.println("What would you like to do next?");
            nextChoice = scnr.next().charAt(0);
            menu(nextChoice);
        } else if(month.equals("FEBRUARY")){

        } else if(month.equals("MARCH")){

        }else if(month.equals("APRIL")){

        } else if(month.equals("MAY")){

        } else if(month.equals("JUNE")){

        } else if(month.equals("JULY")){

        } else if(month.equals("AUGUST")){

        } else if(month.equals("NOVEMBER")){

        } else if(month.equals("DECEMBER")){

        }
    }

    public static void updateEvent(){
        Scanner scnr = new Scanner(System.in);
        String month;
        int day;
        char nextChoice;
        String testStringWorking = "This method is working";
        String testStringFailing = "This method is failing";

        System.out.println("What month would you like to add this event to?");
        month = scnr.next().toUpperCase();

        if(month.equals("JANUARY")){
            System.out.println("What would you like to do next?");
            nextChoice = scnr.next().charAt(0);
            menu(nextChoice);
        } else if(month.equals("FEBRUARY")){

        } else if(month.equals("MARCH")){

        }else if(month.equals("APRIL")){

        } else if(month.equals("MAY")){

        } else if(month.equals("JUNE")){

        } else if(month.equals("JULY")){

        } else if(month.equals("AUGUST")){

        } else if(month.equals("NOVEMBER")){

        } else if(month.equals("DECEMBER")){

        }
    }

    public static void markComplete(){
        Scanner scnr = new Scanner(System.in);
        String month;
        int day;
        char nextChoice;
        String testStringWorking = "This method is working";
        String testStringFailing = "This method is failing";

        System.out.println("What month would you like to add this event to?");
        month = scnr.next().toUpperCase();

        if(month.equals("JANUARY")){
            System.out.println("What would you like to do next?");
            nextChoice = scnr.next().charAt(0);
            menu(nextChoice);
        } else if(month.equals("FEBRUARY")){

        } else if(month.equals("MARCH")){

        }else if(month.equals("APRIL")){

        } else if(month.equals("MAY")){

        } else if(month.equals("JUNE")){

        } else if(month.equals("JULY")){

        } else if(month.equals("AUGUST")){

        } else if(month.equals("NOVEMBER")){

        } else if(month.equals("DECEMBER")){

        }
    }

    /*public static string[][] viewEvent(){
        Scanner scnr = new Scanner(System.in);
        String month;
        int day;
        char nextChoice;
        String testStringWorking = "This method is working";
        String testStringFailing = "This method is failing";

        System.out.println("What month would you like to add this event to?");
        month = scnr.next().toUpperCase();

        if(month.equals("JANUARY")){
            System.out.println("What would you like to do next?");
            nextChoice = scnr.next().charAt(0);
            menu(nextChoice);
        } else if(month.equals("FEBRUARY")){

        } else if(month.equals("MARCH")){

        }else if(month.equals("APRIL")){

        } else if(month.equals("MAY")){

        } else if(month.equals("JUNE")){

        } else if(month.equals("JULY")){

        } else if(month.equals("AUGUST")){

        } else if(month.equals("NOVEMBER")){

        } else if(month.equals("DECEMBER")){

        }
    }*/


    public static String menu(char userInput){
        Scanner scnr = new Scanner(System.in);
        String userString = "";

        while (userInput != 'e') {
            if (userInput == 'a') {
                System.out.println("What event would you like to add?");
                userString = scnr.nextLine();
                System.out.println(addEvent(userString));
            } else if (userInput == 'r') {
                System.out.println("Which event would you like to remove?");
                userString = scnr.nextLine();
            } else if (userInput == 'u') {
                System.out.println("Which event would you like to update?");
                userString = scnr.nextLine();
            } else if (userInput == 'm') {
                System.out.println("Which event would you like to mark as complete?");
                userString = scnr.nextLine();
            } else if (userInput == 'v') {
                System.out.println("Which month are the events you'd like to see in?");
                userString = scnr.nextLine().toUpperCase();
            } else if (userInput == 's') {
                System.out.println("Main Menu");
                System.out.println("a - Add Event");
                System.out.println("r - Remove Event");
                System.out.println("u - Update Existing Event");
                System.out.println("m - Mark Event as Complete");
                System.out.println("v - View Event for a Day");
                System.out.println("s - See menu options");
                System.out.println("e - Exit");

                userInput = scnr.next().charAt(0);
            }
        }

        return userString;

    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userRes;

        System.out.println("Main Menu");
        System.out.println("a - Add Event");
        System.out.println("r - Remove Event");
        System.out.println("u - Update Existing Event");
        System.out.println("m - Mark Event as Complete");
        System.out.println("v - View Event for a Day");
        System.out.println("s - See menu options");
        System.out.println("e - Exit");

        userRes = scnr.next().charAt(0);

        menu(userRes);
    }
}
