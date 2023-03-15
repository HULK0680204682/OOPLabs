public class Variant10 {
    public static void main(String[] args) {
        int wordCount = 0;
        StringBuffer text = new StringBuffer("Ввести текст, що_містить_пару спеціальних символів, які ( вводяться наприклад, дужки ) та або зірочки");
        int initialDeleteIndex = text.indexOf("(");
        int finalDeletionIndex = text.indexOf(")");
        int finalDeletionIndexPlus = finalDeletionIndex + 1;
        System.out.print(text);
        text.delete(initialDeleteIndex, finalDeletionIndexPlus);
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' | text.charAt(i) == '_') {
                wordCount++;
            }
        }
        System.out.print("\n" + text);
        System.out.print("\n" + wordCount);
    }
}
