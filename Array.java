public class Array {
  public static void main(String[] args) {
    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "Rio";
    stringArray[1] = "Griya";
    stringArray[2] = "Putra";

    String fullStringArray = stringArray[0] + " " + stringArray[1] + " " + stringArray[2];

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);

    System.out.println(fullStringArray);

    stringArray[0] = "Pucuk";
    System.out.println(stringArray[0]);

    System.out.println("-----------------------");
    String[] stringArray2 = new String[3];

    String[] namaNama = {
      "Rio", "Griya", "Putra"
    };

    // Manipulate Value Array
    namaNama[0] = null;
    System.out.println(namaNama[0]);


    int[] arrayInt = new int[] {
      1, 2, 3, 4, 5, 6, 7, 8
    };

    long[]  arrayLong = {
      10L, 20L, 30L
    };
    // Manipulate Value Array
    arrayLong[0] = 0;
    System.out.println(arrayLong[0]);

    // Length Array
    System.out.println(arrayLong.length);

    System.out.println("-----------------------------");

    //Nested Array
    String[][] members = {
      {"Pekorine", "Ash"},
      {"Pucuk", "Livers"},
      {"Rio", "Putra"},
    };

    System.out.println(members[0][0]);
    System.out.println(members[1][1]);
  }
}
