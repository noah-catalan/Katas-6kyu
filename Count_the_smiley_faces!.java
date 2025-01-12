import java.util.*;

public class SmileFaces {
  
  public static int countSmileys(List<String> arr) {
      int count = 0;
      String[] faces = {":)",":D",";)",";D",
                       ":-)",":-D",";-)",";-D",
                       ":~)",":~D",";~)",";~D",};
    
      for(int i=0; i<arr.size(); i++){
        if (Arrays.asList(faces).contains(arr.get(i))) {
            count++;
        }
      }
    
      return count;
  }
}
