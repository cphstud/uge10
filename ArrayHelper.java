import java.util.Random;

public class ArrayHelper {
  // TODO:
  // Skriv metoden som fylder et array med tilfældige tal
  public static void fillWithRand(int[] myLocalArr, int randRange){
    Random myRand = new Random();
    for (int i = 0;i < myLocalArr.length;i++) {
      int randInt = myRand.nextInt(randRange);
      myLocalArr[i]=randInt;
    }
  }
}
