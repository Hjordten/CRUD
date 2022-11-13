import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {

    private ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Person> searchResult = new ArrayList<>();

    public Database() {
        personList.add(new Person("Testd", "testb", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testa", "testa", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testd", "testc", "test", 1980, 1.89, 'd'));
        personList.add(new Person("Testc", "testd", "test", 1980, 1.89, 'd'));
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }


    public void addPersonToDatabase(String personFirstName, String personMiddleName, String personLastName, int personBirthYear, double personHeight, char personGender) {
        personList.add(new Person(personFirstName, personMiddleName, personLastName, personBirthYear, personHeight, personGender));
    }

    public void printDatabase() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public int personListSize() {
        return personList.size();
    }

    public void manuelSearchSurName(String manuelSearchString) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getFirstName().toLowerCase().contains(manuelSearchString.toLowerCase())) {
                searchResult.add(p);
            }
            Collections.sort(searchResult, Comparator.comparing(Person::getFirstName));
        }
    }

    public ArrayList<Person> getSearchResult() {
        return searchResult;
    }

    public void printSearchList() {
        for (Person p : searchResult) {
            System.out.println(p);
        }
    }

    public void manuelSearchMiddleName(String manuelSearchString) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getFirstName().toLowerCase().contains(manuelSearchString.toLowerCase())) {
                searchResult.add(p);
            }
            Collections.sort(searchResult, Comparator.comparing(Person::getMiddleName));
        }
    }

}


