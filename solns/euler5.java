public class euler5 {
  public static void main(String[] args) {
    int answer = 0;
    for (int i = 20; i > -1; i+=20){
      boolean isOkay = true;
      for (int j = 1; j <= 20; j++){
        if (i % j != 0)
          isOkay = false;
      }
      if (isOkay == true){
        answer = i;
        break;
      }
    }
    System.out.println(answer);
  }
}