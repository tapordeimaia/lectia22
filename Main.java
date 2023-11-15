import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person(20));
        set.add(new Person(20));
        System.out.println(set);
    }
}