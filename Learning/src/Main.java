import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> words = new HashSet<>();
        Scanner scanner = new Scanner(new File("illiad.txt")).useDelimiter("\\s*|-");
        while(scanner.hasNext()){
            // ok to pass string in directly since HashSet uses equality/hashcodes to check strings by characters: https://stackoverflow.com/questions/8967382/would-a-java-hashsetstrings-contains-method-test-equality-of-the-strings-or
            System.out.println(scanner.next(`));
            //words.add(scanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
        }

        System.out.println(words);
        System.out.println(words.size() + " unique words");

        String test1 = "hello";
        String test2 = "hello";
        if(test2 == test1){
            System.out.println(true);
        }

    }
}
