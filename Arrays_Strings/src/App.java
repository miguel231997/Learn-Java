import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String args[]) {
        //Arrays in java
        //Decalring and initalization

        int[] arr = new int[5];
        int[] arr2 = {1,2,3,4,5,6};

        //accessing elements

        int firstElement = arr2[0];

        //length of an array

        int size = arr2.length;

        //iterating through an array

        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        //enhaved for loop
        for(int num : arr2) {
            System.out.print(num + " ");
        }

        //sorting an array

        Arrays.sort(arr2);

        //searching in an array

        int index = Arrays.binarySearch(arr2, 3);

        //copying an array

        int[] copy = Arrays.copyOf(arr2, arr2.length);

        //2d arrays

        int[][] matrix = new int [3][4];
        matrix[0][1] = 5; //assing a value

        //converting arrays to lists

        List<int[]> list = Arrays.asList(arr2);

        //Strings in java
        //Declaration

        String str = "Hello";

        //string length

        int len = str.length();

        //accessing characters

        char h = str.charAt();

        //Concatenation

        String fullName = "John" + " " + "Doe";

        //substring

        String sub = str.substring(1, 4); //Extracts characters from index 1 to 3

        //String comparison

        boolean isEqual = str.equals("Hello"); // case-sensitive comparison
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello");

        //findining characters in a string

        int index = str.indexOf('o'); //finds the first occurrence of 'o'
        int lastIndex = str.lastIndexOf('o'); //finds the last occurrence

        //replacing characters

        String newStr = str.replace('l', 'p'); //"heppo"

        //splitting a string
        String[] words = "Java is fun".split(" "); //splits the string by spaces

        //converting a string to character array

        char[] charArray = str.toCharArray();

        //stringBuilder(mutable string)

        StringBuilder sb = new StringBuilder("hello");
        sb.append(" Worold");//modifies the oroginal stringbuilder object

        //reversing a string using string builder

        String reversed = new StringBuilder(str).reverse().toString();

        //converting other data types to string

        String numStr = String.valueOf(123); //converts to string






















    }
}
