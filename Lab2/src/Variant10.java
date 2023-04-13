public class Variant10 {
    private int wordCount;

    private final String initialText;
    private final String changedText;

    public String getChangedText() {
        return changedText;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getInitialText() {
        return initialText;
    }

    public Variant10(String text) {
        initialText = text;
        wordCount = Variant10.countWords(text);  //правильний виклик статичного методу(через назву класу)
        changedText = deleteTextInBrackets(text);
    }

    private String deleteTextInBrackets(String text) {
        StringBuilder builder = new StringBuilder(text);
        int initialIndex;
        while ((initialIndex = builder.indexOf("(")) != -1) {
            int endIndex = builder.indexOf(")");
            if (endIndex == -1) {
                endIndex = builder.length();
            }
            builder.delete(initialIndex, endIndex+1);
        }
        return builder.toString();
    }

    public static int countWords(String text) {
        return text.split("[\\s_]").length;
    }
}
