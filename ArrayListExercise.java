import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercise {
    //Method for searching color
    public static String searchColor(String searchTerm, ArrayList<String> arrayColor) {
        for (int i = 0; i < arrayColor.size(); i++) {
            if (searchTerm.equals(arrayColor.get(i))) {
                return "Color " + arrayColor.get(i) + " is in index: " + i;
            }
        }

        return "Color not found in list";
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> col) {
        ArrayList<String> newCol = new ArrayList<>();
        for (String checker: col) {
            if (!newCol.contains(checker) ) {
                newCol.add(checker);
            }

        }

        return newCol;
    }

    public static void main(String[] args) {
        // Initialize ArrayList called color
        ArrayList<String> colors = new ArrayList<>();
        // Adding first 5 elements
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");

        // Printing each element
        for (String col: colors) {
            System.out.println(col);
        }

        System.out.println(colors);

        // Adding element in third position
        colors.add(2, "Black");

        // Print list after changes
        System.out.println(colors);

        // Removing the second element
        colors.remove(1);

        // Print list after changes
        System.out.println(colors);

        // Call searchColor method
        Scanner scan = new Scanner(System.in);
        System.out.print("Search for color: ");
        String search = scan.nextLine();
        scan.close();
        String src = searchColor(search, colors);
        System.out.println(src);

        // Call removeDuplicate method
        colors = removeDuplicates(colors);
        System.out.println(colors);
    }
}
