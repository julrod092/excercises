import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentIntegerInArray {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Write the length of the array: ");
        Integer n = in.nextInt();
        Integer []array = new Integer[n];

        for (Integer i = 0 ; i < n ; i++) {
            array[i] = in.nextInt();
        }

        mostFrequentInteger(array);
    }

    public static void mostFrequentInteger (Integer []array){

        Arrays.sort(array);

        Integer result = 0;
        Integer present = array[0];
        Integer frequent = array[0];
        Integer count = 1;
        Integer pastCount = 1;

        for (Integer i = 1 ; i < array.length ; i++) {
          if (present == array[i]) {
            count += 1;
          } else {
            frequent = (count > pastCount) ? frequent = present : frequent;
            present = array[i];
            pastCount = (count > pastCount) ? count : pastCount;
            count = 1;
          }
        }

        result = (pastCount == count) ? 0 : ((pastCount > count) ? frequent : present);
        System.out.print(result);
    }
}
