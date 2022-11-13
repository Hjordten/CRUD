import java.util.Comparator;

public class MiddleNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return p1.getMiddleName().compareTo(p2.getMiddleName());
    }
}
