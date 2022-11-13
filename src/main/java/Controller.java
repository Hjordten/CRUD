import java.util.ArrayList;

public class Controller {

    Database database = new Database();
    public void addPersonToDatabase(String personFirstName, String personMiddleName, String personLastName, int personBirthYear, double personHeight, char personGender) {
        database.addPersonToDatabase(personFirstName,personMiddleName,personLastName,personBirthYear,personHeight,personGender);
    }

    public String printDatabase() {
        return database.printDatabase();
    }

    public void getPersonList() {
        database.getPersonList();
    }

    public int personListSize() {
        return database.personListSize();
    }

    public ArrayList<Person> manuelSearchUsingString(String manuelSearchString) {
        return database.manuelSearchUsingString(manuelSearchString);
    }
}
