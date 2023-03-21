public  class Variant10 {
   public static void removal()
   {
       Main.endIndex++;
        Main.text.delete(Main.initialIndex, Main.endIndex);
       for (int i = 0; i < Main.text.length(); i++) {
           if (Main.text.charAt(i) == ' ' | Main.text.charAt(i) == '_') {
               Main.wordCount++;
           }
       }
       Main.output();
       System.out.print("\n" + Main.wordCount);
   }
}
