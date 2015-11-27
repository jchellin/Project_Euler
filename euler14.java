public class euler14{
  public static int[] r = new int[10000000];
  
  public static void main(String[] args){
    r[0]=1;
    for (int i = 1; i < r.length; i++){
      r[i] = -1;
    }
   
    int max = 0;
    int maxToken = 0;
    
    for (int i = 2; i < 10000; i++){
      int q = chainLen(i);
      if (q > max){
        max = q;
        maxToken = i;
      }
    }
    
    System.out.println(maxToken+" "+max);
    
  }
  
  public static int chainLen(long x){
    int c = 1;
    if (x-1 < 10000000){
      if (r[(int)x-1] == -1){
        if (x % 2 == 0){
          c += chainLen(x/2);
          r[(int)x-1]=c;
        } else {
          c += chainLen(3*x+1);
          r[(int)x-1]=c;
        }
        return c;
      } else {
        return r[(int)x-1];
      }
    }
    else {
      if (x % 2 == 0){
        c += chainLen(x/2);
      } else {
        c += chainLen(3*x+1);
      }
      return c;
    }
  }
}