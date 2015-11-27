public class euler12{
  public static void main(String[] args){
    int i = 1;
    int number = 0;
    while (NumDivisors(number) < 500){
      number += i;
      i++;
    }
    System.out.println(number);
  }
  
  public static int NumDivisors(int num){
    int divisors = 0;
    for (int i = 1; i<=(int) Math.sqrt(num); i++){
      if (num % i == 0){
        divisors += 2;
      }
    }
    if ((int) Math.sqrt(num)*(int) Math.sqrt(num)==num){
      divisors--;
    }
    return divisors;
  }
}