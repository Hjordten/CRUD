import java.util.Comparator;

public class GenderComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2){
        return Character.compare(p1.getGender(),p2.getGender());
    }
}
