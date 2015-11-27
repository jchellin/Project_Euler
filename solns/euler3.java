public class euler3{
  public static void main(String[] args){
    long number = 10;
    System.out.println(number);
    int longest = 0;
    for (int i = 2; i*i <= number; i++){
      if (number % i == 0){
        number = number / i;
        if (i > longest)
          longest = i;
        System.out.println((long)number*i +"/"+ i +"="+number);
        i = 2;
      }
    }
    System.out.println("The largest prime factor is " +number);
  }
}