import java.util.*;

public class PhoneBookTest {
    public static void main(String[] args) {

        Map<String, List<String>> numbers = new HashMap<>();
        PhoneBook phoneBook = new PhoneBook(numbers);

        phoneBook.addAll("Sammy","3023023022","11151515150");
        phoneBook.add("Letty", "302-111-3435");
        phoneBook.add("Betty", "302-111-3237");
        phoneBook.add("Remmy", "302-111-3633");
        phoneBook.remove("Betty");
        System.out.println(phoneBook.hasEntry("Letty"));
        System.out.println(phoneBook.lookup("Remmy"));
        System.out.println(phoneBook.reverseLookUp("302-111-3435"));
        System.out.println(phoneBook.reverseLookUp("302-111-3431"));
        System.out.println(phoneBook.getAllContactNames());
        System.out.println(phoneBook.toString());
    }
}
