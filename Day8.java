public class Day8 {
    public static void main(String args[]) {
        System.out.println("\n[1] BASIC METHOD ");

        int[] marks = { 90, 80, 70, 60, 50 };
        System.out.print(marks[0] + " ");
        System.out.print(marks[1] + " ");
        System.out.print(marks[2] + " ");
        System.out.print(marks[3] + " ");
        System.out.print(marks[4] + " ");

        System.out.println("\n[2] USING THE FOR LOOP CONCEPT");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        
        System.out.println("\n[3] USING STRING DATA TYPE WITH ARRAY USING THE FOR LOOP ");

        String[] names = { "kirubha", "karan", "R" };
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
    }
}