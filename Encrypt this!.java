public class Kata {
    public static String encryptThis(String text) {
      
        if(text==""){return "";}
        String[] lista = text.split(" ");
        String resultado = "";
      
        for(int i=0; i<lista.length; i++){
          
          if(lista[i].length()==1){
            resultado += String.valueOf((int) lista[i].toCharArray()[0]);
          }else if(lista[i].length()==2){
            resultado+= String.valueOf((int) lista[i].toCharArray()[0]) +
              lista[i].charAt(1);
          } else if(lista[i].length()==3){
             resultado+= String.valueOf((int) lista[i].toCharArray()[0]) +
            lista[i].charAt(2) +
            lista[i].charAt(1);
          } else {
            resultado+= String.valueOf((int) lista[i].toCharArray()[0]) +
            lista[i].charAt(lista[i].length()-1) +
            lista[i].substring(2, lista[i].length()-1) +
            lista[i].charAt(1);
          }
          
          if(lista.length>1 && i!=lista.length-1){
            resultado += " ";
            }
        }
      
      return resultado;
    }
}
