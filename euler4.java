public class euler4{
  public static void main(String[] args){
    int largest = 0;
    for (int i = 0; i<1000; i++){
      for (int j = 0; j<1000; j++){
        if (i*j == reverseInt(i*j) && i*j > largest)
          largest = i*j;
      }
    }
    System.out.println(largest);
  }
  
  public static int reverseInt(int i){
    int result = 0;
    while (i != 0){
      result*=10;
      int lastDigit = i % 10;
      result = result + lastDigit;
      i = i/10;
    }
    return result;
  }
}