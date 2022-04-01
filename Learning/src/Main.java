//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws FileNotFoundException {
//        HashSet<Word> words = new HashSet<>();
//        //  HashSet<String> words = new HashSet<>();
//        Scanner scanner = new Scanner(new File("illiad.txt"));
//        while(scanner.hasNext()){
//            // ok to pass string in directly since HashSet uses equality/hashcodes to check strings by characters: https://stackoverflow.com/questions/8967382/would-a-java-hashsetstrings-contains-method-test-equality-of-the-strings-or
//            //System.out.println(scanner.next());
//            Word word = new Word(scanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
//            if (word.getText().length() > 1 || word.getText() == "a" || word.getText() == "i"){
//                words.add(word);
//            }
//            //words.add(scanner.next().replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
//        }
//
//        System.out.println(words);
//        System.out.println(words.size() + " unique words");
//
//        String test1 = "hello";
//        String test2 = "hello";
//        if(test2 == test1){
//            System.out.println(true);
//        }
//        // one map z
//        //second map
//        //use strings not char(more method)
//        //in constructor create a map with key mapped to shifted value
//
//    }
//}


public class Main {
    /**
     * Find nth term in the Fibonacci sequence
     * @param n term
     * @return the value of the nth term
     */
    public static int fib(int n) {
        if(n <= 0) return -1;
        if(n <= 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    /**
     * Find the sum of the first n terms of the Fibonacci sequence
     * @param n term number to add up to
     * @return the sum of the first n terms
     * eg. 5 returns 12
     */
    public static int fibSum(int n){
        int sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += fib(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fibSum(5));
    }
}


