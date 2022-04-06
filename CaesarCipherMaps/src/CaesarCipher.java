import java.util.HashMap;

public class CaesarCipher {
    HashMap<Character, Character> encryptionMap = new HashMap<>();
    HashMap<Character, Character> decryptionMap = new HashMap<>();

    /**
     * Initalizes instance of CaesarCipher, creates encryption+decryption maps based on provided shift
     * @param shiftKey the shift to use to encrypt/decrypt the cipher
     */
    public CaesarCipher(int shiftKey) {
        for (int i = 0; i < 26; i++) {
            // cast each int i to a char to create the key, but must add an offset of 97 to get correct ASCII value(alphabet starts with a=97)
            char plainLetter = (char)(i+97);
            // cast to create the value, by adding shift to i, then mod26 to remain in range, add 97 for ASCII
            char cipherLetter = (char)((i+shiftKey)%26 + 97);
            // create encryption map with the plaintext letter as the key, and the encrypted letter as the value
            encryptionMap.put(plainLetter, cipherLetter);
            // create encryption map with the encrypted letter as the key, and the plaintext letter as the value
            decryptionMap.put(cipherLetter, plainLetter);
        }
    }

    /**
     * Encrypts an alphabetical string using the caesar cipher, using the shift provided at instantiation
     * @param plainText the text string to be encrypted
     * @return the encrypted resulting string
     */
    public String encrypt(String plainText){
        String cipherText = "";
        for (char letter : plainText.toCharArray()) {
            // catch spaces, do not encrypt it as impossible with caesar cipher, just add it to the result
            if (letter == ' '){
                cipherText += letter;
            }
            else {
                cipherText += encryptionMap.get(letter);
            }
        }
        return cipherText;
    }

    /**
     * Decrypts an alphabetical string using the caesar cipher, using the shift provided at instantiation
     * @param cipherText the text string to be encrypted
     * @return the decrypted resulting string
     */
    public String decrypt(String cipherText){
        String plainText = "";
        for (char letter : cipherText.toCharArray()) {
            // catch spaces, do not decrypt, just add it to the result
            if(letter == ' '){
                plainText += letter;
            }
            else {
                plainText += decryptionMap.get(letter);
            }
        }
        return plainText;
    }
}
