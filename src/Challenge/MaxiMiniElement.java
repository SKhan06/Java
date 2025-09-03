package Challenge;

public class MaxiMiniElement {
    public static void main(String[] args) {
        System.out.println("Welcome to Array of Maximum and Minimum");
        int[] numArray = ArrayUtility.inputArray();
//        int max = maxi(numArray);
//        int mini = mini(numArray);
        int[] minMax= minMaX(numArray);
        System.out.println("Maximum value " + minMax[0]);
        System.out.println("Minimum value " + minMax[1]);

    }

//    public static int maxi(int[] numArray){
//        if (numArray.length == 0) {
//            return Integer.MIN_VALUE;
//        }
//        int max = numArray[0];
//        int i = 1;
//        while (i< numArray.length){
//            if (max <numArray[i]){
//                max = numArray[i];
//            }
//            i++;
//        }
//            return max;
//        }
//
//        public static int mini(int[] numArray){
//        int mini = Integer.MAX_VALUE;
//        int i = 0 ;
//        while (i<numArray.length){
//            if (mini > numArray[i] ){
//                mini = numArray[i];
//
//            }
//            i++;
//        }
//        return mini;
//        }
    public static int[] minMaX(int[] numArray){
      int min= Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      for(int i=0;i< numArray.length;i++){
          if(numArray[i]>max){
              max=numArray[i];
          }
          if(numArray[i]<min){
              min=numArray[i];
          }
      }
        return new int[]{min, max};
    }




}
