import java.util.Scanner;

public class Demo {

    public static final String TEXT_SAMPLE = "Аз съм терорист и нося 5 бомби.";

    public static void main(String args[]) {
        CaesarCipher cc = new CaesarCipher();
        String textInput = "";
        int key;

        do {
            System.out.println("Въведете число-ключ за криптирането по-голямо или равно на нула.");
            key = Integer.parseInt(new Scanner(System.in).next());
        } while (key < 0);

        do {
            System.out.println("Въведете текст за криптиране. За да излезете натиснете Enter.");
            textInput = new Scanner(System.in).nextLine();

            String encrypted = textInput.trim() != "" ? cc.encrypt(textInput, key) : "";
            String decrypted = cc.decrypt(encrypted, key);

            System.out.println(encrypted + "\n" + decrypted);

        } while (!(textInput.equalsIgnoreCase("")));
    }
}
