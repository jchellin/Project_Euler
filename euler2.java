public class euler2 {
  public static void main(String[] args) {
    int result = 2;
    int[] fibonacci = new int[50];
    fibonacci[0] = 1;
    fibonacci[1] = 2;
    for (int i = 2; i < fibonacci.length; i++) {
      if (fibonacci[i-1] + fibonacci[i-2] > 4000000)
        break;
      else {
        fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        if (fibonacci[i] % 2 == 0)
          result = result + fibonacci[i];
      }
    }
    System.out.println(result);
  }
}