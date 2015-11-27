import java.util.*;

public class euler21{
  public static void main(String[] args){
    StopWatch s = new StopWatch();
    s.start();
    
    int[] dn = new int[10000];
    ArrayList<Integer> amicable = new ArrayList<Integer>();
    
    for (int i = 1; i < dn.length; i++){
      dn[i]=d(i);
    }
    
    for (int i = 1; i < dn.length; i++){
      if (dn[i]<dn.length){
        if (dn[dn[i]]==i && dn[i]!=i){
          amicable.add(dn[i]);
          amicable.add(i);
          dn[dn[i]]=0;
          dn[i]=0;
        }
      }
    }
    
    int sum = 0;
    
    for (int i = 0; i < amicable.size(); i++){
      sum+=amicable.get(i);
    }
    
    s.stop();
    
    System.out.println(sum);
    System.out.println("Calculations took "+s.getTimeMilli()+" milliseconds to complete.");
  }
  
  public static int d(int n){
    int r = 1;
    for (int i = 2; i <= n/2; i++){
      if (n%i == 0)
        r+=i;
    }
    return r;
  }
}