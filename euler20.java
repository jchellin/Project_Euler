import java.math.*;

public class euler20{
  public static void main(String[] args){
    BigInteger n = new BigInteger("1");
    
    for (BigInteger i = new BigInteger("2"); (i.compareTo(new BigInteger("101"))==-1); i=i.add(new BigInteger("1"))){
      n=n.multiply(i);
    }
    
    System.out.println(n);
    
    String s = n.toString();
    int sum = 0;
    for (int i = 0; i < s.length(); i++){
      sum+=Integer.parseInt(s.charAt(i)+"");
    }
    System.out.println(sum);
  }
}