public class GoodVsEvil {
  public static String battle(String goodAmounts, String evilAmounts) {
    String[] goodArray = goodAmounts.split(" ");
    String[] evilArray = evilAmounts.split(" ");
    
    int goodPower = 0;
    int evilPower = 0;
    
    int[] goodArrayWorth = new int[] {1,2,3,3,4,10};
    int[] evilArrayWorth = new int[] {1,2,2,2,3,5,10};
    
    
    for(int i=0; i<goodArray.length; i++){
      goodPower += Integer.parseInt(goodArray[i])*goodArrayWorth[i];
    }
    
    for(int i=0; i<evilArray.length; i++){
      evilPower += Integer.parseInt(evilArray[i])*evilArrayWorth[i];
    }
    
    if(evilPower==goodPower){
      return "Battle Result: No victor on this battle field";
    } else if(evilPower>goodPower){
      return "Battle Result: Evil eradicates all trace of Good";
    } else {
      return "Battle Result: Good triumphs over Evil";
    }
    
  }
}
