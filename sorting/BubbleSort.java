import java.util.Scanner;

public class BubbleSort {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    Integer n = in.nextInt();
    Integer []array = new Integer[n];
    for (Integer i = 0 ; i < n ; i++) {
      array[i] = in.nextInt();
    }

    bubbleSort(array, n);
  }

  public static void bubbleSort(Integer []array, Integer n) {

    for (Integer i = 0 ; i < n ; i++) {
      for (Integer j = 0 ; j < n ; j++) {
        if (i != 0) {
          if (array[i] < array[j]) {
            Integer tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
          }
        } else {
          continue;
        }
      }
    }

    for (Integer i = 0 ; i < n ; i++) {
      System.out.println(array[i]);
    }
  }
}
