public class Main {
    public static void main(String[] args) {
        Variant10 variant10 = new Variant10("Ввести текст, що_містить_пару спеціальних символів, які (вводяться наприклад, дужки) та або зірочки");

        System.out.println("Вихідний текст:\n" + variant10.getInitialText());
        System.out.println("Кількість слів: " + variant10.getWordCount());
        System.out.println("Змінений текст:\n" + variant10.getChangedText());
    }
}