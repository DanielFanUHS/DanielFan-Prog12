import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<String> words = new HashSet<>();
        Scanner scanner = new Scanner(new File("illiad.txt"));

        while(scanner.hasNext()){
            //remove all characters(eg. punctuation) besides letters and numbers -> lowercase
            String word = scanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            if (word.length() > 1 || word == "a" || word == "i"){
                words.add(word);
            }
        }

        //System.out.println(words);
        System.out.println(words.size() + " unique words");
        // one map z
        //second map
        //use strings not char(more method)
        //in constructor create a map with key mapped to shifted value

    }
}



