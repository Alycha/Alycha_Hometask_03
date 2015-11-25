import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by Alycha on 11/23/2015.
 */

/**
 * Task 1
 * Enum stores 7 strings. Create a program that would sort these strings and print them to the screen.
 * Use collections.
 */

public enum EnumStrings {
    FIRST("Kaph Lamed"),
    SECOND("Aleph Beth"),
    THIRD("He Gimel"),
    FOURTH("Heth Yod"),
    FIFTH("Ayin Nun"),
    SIXTH("Teth Daleth"),
    SEVENTH("Tsadi Mem");

    private String description;
    private EnumStrings(String description) {
        this.description = description;
    }
    public String getDescription() { return description; }

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        set.add(FIRST.getDescription());
        set.add(SECOND.getDescription());
        set.add(THIRD.getDescription());
        set.add(FOURTH.getDescription());
        set.add(FIFTH.getDescription());
        set.add(SIXTH.getDescription());
        set.add(SEVENTH.getDescription());
        System.out.println(set);
    }
}
