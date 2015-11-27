import java.util.*;

public class euler14_revised{
  public static HashMap<Integer, Integer> r = new HashMap<Integer,Integer>();
  public static int lim = 100;
  
  public static void main(String[] args){
    r.put(1,1);
    int max = 0;
    int maxToken = 0;
    for (int i = 1; i < lim; i++){
      if (getLength(i)>max){
        max=getLength(i);
        maxToken=i;
      }
    }
    System.out.println("The longest chain is "+max+" at "+maxToken+".");    
  }
  
  public static int getLength(int x){
    int c = 1;
    if (r.containsKey(x)){
      return r.get(x);
    } else {
      if (x%2 == 0){
        c+=getLength(x/2);
        r.put(x,c);
      } else {
        c+=getLength(3*x+1);
        r.put(x,c);
      }
    }
    return c;
  }
}