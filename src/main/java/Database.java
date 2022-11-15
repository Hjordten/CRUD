import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Database {

    private ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Person> searchResult = new ArrayList<>();

    public Database() {
        personList.add(new Person("Testd", "testb", "testb", 1980, 1.89, 'M'));
        personList.add(new Person("Testa", "testa", "testa", 1990, 2, 'M'));
        personList.add(new Person("Testd", "testc", "testd", 1995, 1.5, 'F'));
        personList.add(new Person("Testc", "testd", "testc", 2000, 1.90, 'O'));
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

    public void printSearchList() {
        for (Person p : searchResult) {
            System.out.println(p);
        }
    }

    public void manuelSearchMiddleName(String manuelSearchString) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getMiddleName().toLowerCase().contains(manuelSearchString.toLowerCase())) {
                searchResult.add(p);
            }
            Collections.sort(searchResult, Comparator.comparing(Person::getMiddleName));
        }
    }

    public void manuelSearchLastName(String manuelSearchString) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getLastName().toLowerCase().contains(manuelSearchString.toLowerCase())) {
                searchResult.add(p);
            }
            Collections.sort(searchResult, Comparator.comparing(Person::getLastName));
        }
    }

    public void manuelSearchUsingBirthYear(int birthYear) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getBirthYear() == birthYear) {
                searchResult.add(p);
            }
        }
    }

    public void manuelSearchUsingHeight(double height) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getHeight() == height) {
                searchResult.add(p);
            }
        }
    }

    public void manuelSearchUsingChar(char gender) {
        searchResult.clear();
        for (Person p : personList) {
            if (p.getGender() == gender) {
                searchResult.add(p);
            }

        }
    }

    public void removePerson(int number) {
        personList.remove(number);
    }
}








