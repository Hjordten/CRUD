import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {

    private ArrayList<Person> personList = new ArrayList<>();

    public Database() {
        personList.add(new Person("Testb", "test", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testa", "test", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testc", "test", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testd", "test", "test", 1980, 1.89, 'd'));
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }


    public void addPersonToDatabase(String personFirstName, String personMiddleName, String personLastName, int personBirthYear, double personHeight, char personGender) {
        personList.add(new Person(personFirstName, personMiddleName, personLastName, personBirthYear, personHeight, personGender));
    }

    public String printDatabase() {
        for (Person p : personList) {
            System.out.println(p);
        }
        return null;
    }

    public int personListSize() {
        return personList.size();
    }

    public ArrayList<Person> manuelSearchUsingString(String manuelSearchString) {
        ArrayList<Person> searchResult = new ArrayList<>();
        for (Person p : personList) {
            if (p.getFirstName().toLowerCase().contains(manuelSearchString.toLowerCase())) {
                searchResult.add(p);
            }
            Collections.sort(searchResult, Comparator.comparing(Person::getFirstName));
        }
        return searchResult;
    }
}
