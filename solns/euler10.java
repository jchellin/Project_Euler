public class euler10{
  public static void main(String[] args){
    long sum = 0;
    int max = 2000000;
    for (int i = 2; i < max; i++){
      boolean prime = true;
      for (int j = 2; j <= Math.sqrt(i); j++){
        if (i % j == 0)
          prime = false;
      }
      if (prime == true){
        //System.out.println(i);
        sum += i;
      }
    }
    System.out.println("Sum: "+sum);
  }
}