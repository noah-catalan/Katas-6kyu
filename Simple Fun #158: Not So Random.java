class Kata {

  public static String notSoRandom(int b, int w) {

    if (b%2 == 1 && w%2 == 1) {
      // Los dos impares
      return "Black";
    } else if (b % 2 == 0 && w % 2 == 0) {
      // Los dos pares
      return "White";
    } else if (b % 2 == 1 && w % 2 == 0) {
      // Black impar white par
      return "Black";
    } else {
      // black par white impar
      return "White";
    }  
  }
}
