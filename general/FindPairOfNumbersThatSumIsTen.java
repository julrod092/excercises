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

    for (Integer i = 0 ; i < array.length ; i++) {
      Integer lastOne = array.length - 1;
      if (i != (lastOne - i)){
        Integer sum = array[i] + array[lastOne - i];
        if (sum == 10){
          System.out.println("(" + array[i] + ", " + array[lastOne - i] +")");
          break;
        }else{
          continue;
        }
      } else {
        continue;
      }
    }
  }
}
