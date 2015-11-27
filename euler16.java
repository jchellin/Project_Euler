import java.math.*;

public class euler16{
  public static void main(String[] args){
    BigInteger result = new BigInteger("2");
    result = result.pow(1000);
    System.out.println(result);
    
    String r = result.toString();
    
    long sum = 0;
    
    for (int i = 0; i < r.length(); i++){
      sum+=Integer.parseInt(r.charAt(i)+"");
    }
    
    System.out.println(sum);
  }
}