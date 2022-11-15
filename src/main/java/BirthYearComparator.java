import java.util.Comparator;

public class BirthYearComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return Integer.compare(p1.getBirthYear(),p2.getBirthYear());
    }
}
