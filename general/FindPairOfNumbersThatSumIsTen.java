import java.util.Scanner;

public class FindPairOfNumbersThatSumIsTen {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    System.out.print("Which is the length of the array: ");
    Integer n = in.nextInt();

    Integer []array = new Integer[n];
    for (Integer i = 0 ; i < n ; i++){
      array[i] = in.nextInt();
    }
    pairOfNumberThatSumIsTen(array);
  }

  public static void pairOfNumberThatSumIsTen (Integer []array){

    Integer i = 0;
    Integer j = array.length - 1;
    Integer a = 0;
    Integer b = 0;

    while (i < j) {
      if (array[i] + array[j] == 10) {
        a = array[i];
        b = array[j];
        break;
      }else{
        if(array[i] + array[j] > 10){
          j--;
        }else{
          i++;
        }
        System.out.println("i = " + i + " j = " + j);
      }
    }
    System.out.println("(" + a + ", " + b + ")");
  }
}
