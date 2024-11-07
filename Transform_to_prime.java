public class Solution{
  
    public static boolean esPrimo(int a){
      if(a<2){return false;}
      for(int i=2; i<a; i++){
        if(a%i==0){
          return false;
        }
      }
      return true;
    }

  
    public static int minimumNumber(int[] numbers){
      
      int proximoPrimo = 0;
      int suma = 0;
      
      for (int i=0; i<numbers.length; i++){
        suma += numbers[i];
      }
      
      for(int i=2; true; i++){
        if(esPrimo(i)){
          if(i>=suma){
            proximoPrimo = i;
            break;
          }
        }
      }
      
        return proximoPrimo - suma; 
    }
}
