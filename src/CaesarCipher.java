public class CaesarCipher {
    private String table = "абвгдежзийклмнопрстуфхцчшщъьюя.,;_:+-*/ @$№?!=()[]{}\\\"";

    private String cleanText(String text) {
        text = text.toLowerCase().replaceAll(" ", "");

        for (int i = 0; i < text.length(); ++i) {
            int pos = table.indexOf(text.charAt(i));

            if (pos == -1) {
                text = text.replace(text.charAt(i), ' ');
            }
        }
        return text;
    }

    public String encrypt(String text, int key) {
        String cleanedText = cleanText(text);
        String encrypted = "";

        for (int i = 0; i < cleanedText.length(); ++i) {
            int pos = table.indexOf(cleanedText.charAt(i));
                System.out.print((Math.abs(pos + key)) % table.length() + " ");
                encrypted += table.charAt((Math.abs(pos + key)) % table.length());
        }
        System.out.println();
        return encrypted;
    }

    public String decrypt(String text, int key) {
        String cleanedText = cleanText(text);
        String decrypted = "";

        for (int i = 0; i < cleanedText.length(); ++i) {
            int pos = table.indexOf(cleanedText.charAt(i));
            System.out.print((Math.abs(pos-key)) % table.length() + " ");
            int ans = (Math.abs(pos-key)) % table.length();
            if ( ans == 0 ) {
                decrypted += table.charAt(ans);
            } else {
                decrypted += table.charAt(Math.abs(ans - table.length()));
            }
        }
        System.out.println();
        return decrypted;
    }
}
