
public class Main {
    public static StringBuffer text = new StringBuffer("Ввести текст, що_містить_пару спеціальних символів, які ( вводяться наприклад, дужки ) та або зірочки");
    public static int wordCount = 0;
    public static int initialIndex = text.indexOf("(");
    public static  int endIndex = text.indexOf(")");

    public static void main(String[] args) {
        Main.output();
       Variant10.removal();
    }
    public static void output() {
        System.out.print("\n" + text);

    }
}