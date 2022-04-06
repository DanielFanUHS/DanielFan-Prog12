
public class Main {
    public static void main(String[] args) {
        int shift =  7;
        CaesarCipher caesar = new CaesarCipher(shift);

        System.out.println(caesar.encrypt("hello world"));

        System.out.println(caesar.decrypt("olssv dvysk"));
    }
}
