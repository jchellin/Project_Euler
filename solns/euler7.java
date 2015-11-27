public class euler7{
  public static void main(String[] args){
    int[] primes = new int[10002];
    int index = 1;
    primes[0]=2;
    for (int i = 2; index < primes.length; i++){
      boolean isPrime = true;
      for (int j = 2; j < i; j++){
        if (i % j == 0) {
          isPrime=false;
          break;
        }
      }
      if (isPrime){
        System.out.println(index+": "+i);
        primes[index]=i;
        index++;
      }
    }
  }
}