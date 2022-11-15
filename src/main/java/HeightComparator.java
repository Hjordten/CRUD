import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {

    @Override
    public int compare (Person p1, Person p2){
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}
