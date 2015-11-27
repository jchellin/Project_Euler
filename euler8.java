public class euler8{
  public static void main(String[] args){
    int strLen = 13;
    long largest = 0;
    String largestDigits = "";
    int[] digits = new int[10000];
    for (int i = 0; i < args[0].length(); i++){
      digits[i]=Character.digit(args[0].charAt(i),10);
    }
    for (int i = 0; i < digits.length-strLen; i++){
      long product = 1;
      String nums = "";
      for (int j = 0; j < strLen; j++){
        product*=digits[i+j];
        nums = nums+Integer.toString(digits[i+j]);
      }
      if (product > largest){
        largest = product;
        largestDigits = nums;
      }
    }
    System.out.println(largest);
    System.out.println(largestDigits);
  }
}