public class Fibonacci {
  public static int fib(int n) {
    
    int temp;
    int num = 1;
    
    for(int i = 0; i<n; i++){
      temp = num;
      num += temp;
    }
    
    return num;
  }
}
