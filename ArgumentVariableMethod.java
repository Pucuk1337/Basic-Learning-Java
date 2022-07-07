public class ArgumentVariableMethod {
  public static void main(String[] args) {

    int[] values = {50, 52, 55, 62};
    sayCongrats("Peko", values);
    sayCongrats("Pekorine", 75,75,78,100);
    
  }
  static void sayCongrats(String nama, int... values){
    var total = 0;
    for(var value: values){
      total += value;
    }
    var finalValue = total / values.length;

    if(finalValue >= 75){
      System.out.println("Selamat " + nama + " Anda Lulus!");
    } else {
      System.out.println("Maaf Silahkan Coba Lagi!");
    }
  }
}
