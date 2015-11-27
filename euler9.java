public class euler9{
  public static void main(String[] args){
    outerloop:
    for (int a = 2; a < 1000; a++){
      for (int b = 2; b < 1000; b++){
        int cSquared = a*a + b*b;
        if (Math.sqrt(cSquared) == (int)Math.sqrt(cSquared)){
          int sum = a+b+(int)Math.sqrt(cSquared);
          System.out.println(a+"^2 + "+b+"^2 = "+(int)Math.sqrt(cSquared)+"^2, sum "+sum);
          if (sum==1000)
            break outerloop;
        }
      }
    }
  }
}