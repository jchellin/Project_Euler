public class euler6{
  public static void main(String[] args){
    long answer = squareSum(100) - sumSquares(100);
    System.out.println(answer);
  }
  
  public static long sumSquares(int i){
    int result = 0;
    for (int j = 1; j <= i; j++)
      result+=j*j;
    return result;
  }
  
  public static long squareSum(int i){
    int result = 0;
    for (int j = 1; j <= i; j++)
      result+=j;
    result=result*result;
    return result;
  }
}