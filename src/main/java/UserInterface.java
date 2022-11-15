import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    Scanner sc = new Scanner(System.in);

    Controller controller = new Controller();

    public void createUI() {
        while (true) {
            mainMenuOptions();
            switch (readInt()) {
                case 1:
                    addPersonToDatabase();
                    break;
                case 2:
                    if (controller.personListSize() < 0) {
                        System.out.println("There are currently no persons registered in the database.");
                        break;
                    }
                    controller.printDatabase();
                    break;
                case 3:
                    manuelSearch();
                    break;
                case 4:
                    removePerson();
                    break;
                case 5:
                    sortUsingOneCriteriaUserChoice();
                    break;
                case 6:
                    sortUsingTwoCriteriaUserChoice();
                    break;
                case 7:
                    //
                    break;
                case 9:
                    System.out.println("Closing database");
                    System.exit(0);
                default:
                    System.out.println("Could not handle input. Please type again");
                    break;
            }
        }
    }

    private void sortUsingTwoCriteriaUserChoice() {
        System.out.println("dasd");
    }

    private void SortUsingCriteriaOptions() {
        System.out.println("""
                1. Sort using first name.
                2. Sort using middle name.
                3. Sort using last name.
                4. Sort using birth year.
                5. Sort using height.
                6. Sort using gender.
                9. Return to main menu.
                """);
    }

    private void sortUsingOneCriteriaUserChoice(){
        SortUsingCriteriaOptions();
        Comparator<Person> comparator = null;
        switch (readInt()){
            case 1:
                comparator = new SurNameComparator();
                break;
            case 2:
                comparator = new MiddleNameComparator();
                break;
            case 3:
                comparator = new LastNameComparator();
                break;
            case 4:
                comparator = new BirthYearComparator();
                break;
            case 5:
                comparator = new HeightComparator();
                break;
            case 6:
                comparator = new GenderComparator();
                break;
            case 9:
                createUI();
                break;

        }

        Collections.sort(controller.getPersonList(), comparator);
        controller.printDatabase();
    }

    private void removePerson() {
        for (int i = 0; i < controller.personListSize(); i++) {
            System.out.println(i + ":" + controller.getPersonList().get(i));
        }
        try {

            System.out.println("Please enter the number of which person you wanna remove: ");

            int number = readInt();


            controller.removePerson(number);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Not a valid number. Returning to main menu");
        }
    }


    private void mainMenuOptions() {
        System.out.println("""
                Please type the number of which option you wanna use:
                1. create superhero(es).
                2. Print database
                3. Manuel search
                4. Remove superhero.
                5. Search for superhero using parameter.
                6. Edit superhero.
                7. Search for superhero using two parameters.
                9. Exit
                """);
    }

    public void manuelSearch() {

        searchOptionsMenu();
        String manuelSearchString = "";
        int birthYear;
        double height;

        switch (readInt()) {
            case 1:
                System.out.println("Enter the sur name you wanna search for: ");
                manuelSearchString = sc.nextLine();
                controller.manuelSearchSurName(manuelSearchString);
                controller.printSearchList();
                break;
            case 2:
                System.out.println("Enter the middle name you wanna search for: ");
                manuelSearchString = sc.nextLine();
                controller.manuelSearchMiddleName(manuelSearchString);
                controller.printSearchList();
                break;
            case 3:
                System.out.println("Enter the last name you wanna search for: ");
                manuelSearchString = sc.nextLine();
                controller.manuelSearchLastName(manuelSearchString);
                controller.printSearchList();
                break;
            case 4:
                System.out.println("Enter the birth year you wanna search for: ");
                birthYear = readInt();
                controller.manuelSearchUsingBirthYear(birthYear);
                controller.printSearchList();
                break;
            case 5:
                System.out.println("Enter the height you wanna search for: ");
                height = readDouble();
                controller.manuelSearchUsingHeight(height);
                controller.printSearchList();
                break;
            case 6:
                System.out.println("Please enter the gender and press ENTER: \nPress M for male.\nPress F for female.\nPress O for other.");
                char genderSearch = sc.next().charAt(0);
                if (genderSearch == 'M') {
                    char genderSearchMale = genderSearch;
                    controller.manuelSearchUsingChar(genderSearchMale);
                    controller.printSearchList();
                } else if (genderSearch == 'F') {
                    char genderSearchFemale = genderSearch;
                    controller.manuelSearchUsingChar(genderSearchFemale);
                    controller.printSearchList();
                } else if (genderSearch == 'O') {
                    char genderSearchOther = genderSearch;
                    controller.manuelSearchUsingChar(genderSearchOther);
                    controller.printSearchList();
                } else {
                    System.out.println("Not a valid option. Returning to main menu.");
                }
                break;
            case 9:
                createUI();

        }
    }

    public void searchOptionsMenu() {
        System.out.println("""
                Please type the number of which option you wanna use:
                1. Search using sur name.
                2. Search using middle name.
                3. Search using last name.
                4. Search using birth year.
                5. Search using height.
                6. Search using gender.
                9. Return to previous menu.
                """);
    }

    public void addPersonToDatabase() {
        System.out.println(" ");
        System.out.println("Time to create a new person.\nFirst off, please type the sur name of the person and press ENTER: ");
        String personFirstName = sc.nextLine();
        System.out.println("You have chosen the sur name of the new hero to be: " + personFirstName);
        System.out.println(" ");

        System.out.println("Please enter the middle name of the person: ");
        String personMiddleName = sc.nextLine();
        System.out.println("You have chosen middle name to be: " + personMiddleName);
        System.out.println(" ");

        sc.nextLine();

        System.out.println("Please enter the last name of the person.");
        String personLastName = sc.nextLine();
        System.out.println("You have chosen the last name to be: " + personLastName);
        System.out.println(" ");


        System.out.println("Please enter the birth year and press ENTER:");
        int personBirthYear = readInt();
        System.out.println("You have chosen birth year to be: " + personBirthYear);
        System.out.println(" ");

        System.out.println("Please enter the height and press ENTER: ");
        double personHeight = readDouble();
        System.out.println("You have chosen height to be: " + personHeight);
        System.out.println("");

        System.out.println("Please enter the gender and press ENTER: \nPress M for male.\nPress F for female.\nPress O for other.");
        char personGender = sc.next().charAt(0);
        if (personGender == 'M') {
            System.out.println("You have selected gender to be: " + personGender);
        } else if (personGender == 'F') {
            System.out.println("You have selected gender to be: " + personGender);
        } else if (personGender == 'O') {
            System.out.println("you have selected gender to be: " + personGender);
        } else {
            System.out.println("Not a valid option. Gender has been set to Male. " + "\nPlease use 'Edit persons' to change it");
        }

        controller.addPersonToDatabase(personFirstName, personMiddleName, personLastName, personBirthYear, personHeight, personGender);
    }


    private int readInt() {

        boolean validateInt = true;
        int integer = 0;

        do {
            try {

                integer = sc.nextInt();
                validateInt = false;
                sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Not a valid number. Please only enter whole numbers.");
                sc.nextLine();
            }
        }
        while (validateInt);
        return integer;
    }

    private double readDouble() {
        boolean validateDouble = true;
        double doubleValue = 0.0;

        do {
            try {

                doubleValue = sc.nextDouble();
                validateDouble = false;
                sc.nextLine();

            } catch (InputMismatchException e) {
                System.out.println("Not a valid number. Please use (.) period to separate decimals.");
                sc.nextLine();
            }
        }
        while (validateDouble);
        return doubleValue;
    }
}




