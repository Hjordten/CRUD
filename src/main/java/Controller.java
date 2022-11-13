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
}
