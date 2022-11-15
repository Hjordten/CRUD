import java.util.ArrayList;

public class Controller {

    Database database = new Database();
    public void addPersonToDatabase(String personFirstName, String personMiddleName, String personLastName, int personBirthYear, double personHeight, char personGender) {
        database.addPersonToDatabase(personFirstName,personMiddleName,personLastName,personBirthYear,personHeight,personGender);
    }

    public void printDatabase() {
        database.printDatabase();
    }

    public void printSearchList(){
        database.printSearchList();
    }



    public int personListSize() {
        return database.personListSize();
    }

    public void manuelSearchSurName(String manuelSearchString) {
        database.manuelSearchSurName(manuelSearchString);
    }


    public void manuelSearchMiddleName(String manuelSearchString) {
        database.manuelSearchMiddleName(manuelSearchString);

    }

    public void manuelSearchLastName(String manuelSearchString) {
        database.manuelSearchLastName(manuelSearchString);
    }

    public void manuelSearchUsingBirthYear(int birthYear) {
        database.manuelSearchUsingBirthYear(birthYear);
    }

    public void manuelSearchUsingHeight(double height) {
        database.manuelSearchUsingHeight(height);
    }

    public void manuelSearchUsingChar(char gender) {
        database.manuelSearchUsingChar(gender);
    }

    public ArrayList<Person> getPersonList(){
        return database.getPersonList();
    }

    public void removePerson(int number) {
        database.removePerson(number);
    }
}
