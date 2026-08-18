public class Day6 {
    public static void main(String[] args) {

        System.out.println("\n[1] STRING BUFFER - APPEND");

        StringBuffer buffer = new StringBuffer("Java");

        buffer.append(" Programming");

        System.out.println("Result : " + buffer);

        System.out.println("\n[2] STRING BUFFER - INSERT");

        StringBuffer insertText = new StringBuffer("Java Programming");

        insertText.insert(5, "Full Stack ");

        System.out.println("Result : " + insertText);

        System.out.println("\n[3] STRING BUFFER - REPLACE");

        StringBuffer replaceText = new StringBuffer("Java Programming");

        replaceText.replace(5, 16, "Developer");

        System.out.println("Result : " + replaceText);

        System.out.println("\n[4] STRING BUFFER - DELETE");

        StringBuffer deleteText = new StringBuffer("Java Developer");

        deleteText.delete(5, 6);

        System.out.println("Result : " + deleteText);

        System.out.println("\n[5] STRING BUFFER - REVERSE");

        StringBuffer reverseText = new StringBuffer("Java");

        reverseText.reverse();

        System.out.println("Result : " + reverseText);

        System.out.println("\n[6] STRING BUILDER - APPEND");

        StringBuilder builder = new StringBuilder("Java");

        builder.append(" Programming");

        System.out.println("Result : " + builder);

        System.out.println("\n[7] STRING BUILDER - INSERT");

        StringBuilder builderInsert = new StringBuilder("Java Developer");

        builderInsert.insert(5, "Full Stack ");

        System.out.println("Result : " + builderInsert);

        System.out.println("\n[8] STRING BUILDER - REPLACE");

        StringBuilder builderReplace = new StringBuilder("Java Programming");

        builderReplace.replace(5, 16, "Developer");

        System.out.println("Result : " + builderReplace);

        System.out.println("\n[9] STRING BUILDER - DELETE");

        StringBuilder builderDelete = new StringBuilder("Java Developer");

        builderDelete.delete(5, 6);

        System.out.println("Result : " + builderDelete);

        System.out.println("\n[10] STRING BUILDER - REVERSE");

        StringBuilder builderReverse = new StringBuilder("Java");

        builderReverse.reverse();

        System.out.println("Result : " + builderReverse);
    }
}