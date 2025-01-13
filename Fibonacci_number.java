public class Fibonacci {
  public static int fib(int n) {
    if (n < 0) {
      throw new IllegalArgumentException("Input must be a non-negative integer.");
    }
    
    if (n == 0) {return 0;} 
    if (n == 1) {return 1;}
    
    int prev = 0; 
    int curr = 1; 
    
    for (int i = 2; i <= n; i++) {
      int temp = num;  
      num += prev;
      prev = temp;
    }
    
    return num;
  }
}
