import java.util.Arrays;

public class CharHistogram {
	public static void main(String[] args) {
          /*
           * FORMÅL: Øve arrays
           *
           * OPGAVE:
           * Der er to opgaver
           * 1)Skriv hjælperklassen fillWithRand i ArrayHelper.java
           *
           * 2)Benyt samme teknik som i Thinkjava afsnit 7.7 til at lave et
           * histogram over forekomsten af tal i det array som fillWithRand laver.
           *
           * Fremgangsmåde:
           * skriv en metode - uniqueArr - som har følgende signatur:
           * public static void uniqueArr(int[] myArr, int[] myRetValArr){
           * myArr er et array fyldt med tilfældige heltal i en given range
           * Metoden skal tælle hyppigheden af de enkelte tal i rangen og printe
           * et histogram som vist nedenfor
           *
           * TESTKØRSEL:
           * Metoden skal printe flg:
           
           
              0:*
              1:*********
              2:******
              3:****
              4:*******
              5:**
              6:***
              7:*
              8:******
           
           * for dette array
           * [3, 5, 2, 1, 4, 1, 1, 5, 2, 1, 2, 8, 8, 1, 7, 8, 6, 1, 8, 1, 4, 6, 4, 
           * 1, 1, 3, 4, 8, 2, 2, 3, 4, 3, 4, 6, 2, 0, 4, 8, 7]
           *
           * 
           */

		boolean test = true;
                // test = false;
		int size = 40;
		int randRange = 9;
		int[] myArr = new int[size];
		int[] myRetArr = new int[randRange];
                if (test) {
                  myArr = new int[] {3, 5, 2, 1, 4, 1, 1, 5, 2, 1, 2, 8, 8, 1, 7, 8, 6, 1, 8, 1, 4, 6, 4, 1, 1, 3, 4, 8, 2, 2, 3, 4, 3, 4, 6, 2, 0, 4, 8, 7};
                } else {
		ArrayHelper.fillWithRand(myArr,randRange);
                }
		uniqueArr(myArr,myRetArr);
		
	}
	public static void uniqueArr(int[] myArr, int[] myRetValArr){
		System.out.println("ARRAY: " +Arrays.toString(myArr));

		for (int i=0;i<myArr.length;i++) {
			int idx=myArr[i];
			myRetValArr[idx]++;
		}
		for (int i=0;i<myRetValArr.length;i++) {
		String myC ="*";
		String myS ="";
			for (int j=0;j<myRetValArr[i];j++) {
				myS = myS + myC;
			}
			System.out.printf("%d:%s%n",i,myS);
		}
	}
}
