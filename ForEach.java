public class ForEach {
  public static void main(String[] args) {
    String[] name = {
      "Rio", "Griya", "Putra",
      "Pucuk", "Pekorine", "Peko"
    };
    for(var i = 0; i < name.length; i++){
      System.out.println(name[i]);
    }

    System.out.println("--- For Each Method --- ");
    for(var names: name){
      System.out.println(names);
    }
  }
}
