public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
      
      int[] coordenadas = new int[6];
      int contador = 0;
      
      
        for(int i=0; i<yard.length; i++){
          
          if(yard[i].indexOf('M') != -1 || 
             yard[i].indexOf('R') != -1 || 
             yard[i].indexOf('L') != -1){
            
            
            
            for(int j=0; j<yard[i].length(); j++){
              if(yard[i].charAt(j) == 'L' || 
                 yard[i].charAt(j) == 'R' || 
                 yard[i].charAt(j) == 'M'){
                
                coordenadas[(contador*2)] = j;
                coordenadas[(contador*2)+1] = i;
                contador++;
              }
              
            }
            
          }
          
        }
      
      // condicional para comprobar distancias una o dos veces en función de los gatos que haya
      
      if(contador == 1 || contador == 0){return true;}
      else if(contador == 2){
        // dos gatos (1 comprobación)
        
        int cor1 = coordenadas[0]-coordenadas[2];
        int cor2 = coordenadas[1]-coordenadas[3];
        
        
        double distancia = Math.sqrt((cor1*cor1)+(cor2*cor2));
        if(distancia<minDistance){
          return false;
        } else {
          return true;
        }
        
        
      } else{
        // 3 gatos (3 comprobaciones)
        int cor1 = coordenadas[0]-coordenadas[2];
        int cor2 = coordenadas[1]-coordenadas[3];
        
        int cor3 = coordenadas[0]-coordenadas[4];
        int cor4 = coordenadas[1]-coordenadas[5];
        
        int cor5 = coordenadas[4]-coordenadas[2];
        int cor6 = coordenadas[5]-coordenadas[3];
        
        double distancia1 = Math.sqrt((cor1*cor1)+(cor2*cor2));
        double distancia2 = Math.sqrt((cor3*cor3)+(cor4*cor4));
        double distancia3 = Math.sqrt((cor5*cor5)+(cor6*cor6));
          
        if(distancia1<minDistance || 
           distancia2<minDistance || 
           distancia3<minDistance){
          return false;
        } else {
          return true;
        }
        
      }
      
      
    }
}
