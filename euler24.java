public class euler24{
  public static void main(String[] args){
    int max = 2;
    int[] digits = new int[max+1];
    for (int i = 0; i <= max; i++){
      digits[i] = max - (max - i);
      System.out.print(digits[i]);
      if (i==max){
        System.out.println();
      }
    }
    
  }
}
  