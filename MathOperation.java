public class MathOperation {
  public static void main(String[] args) {
    int a = 100;
    int b = 10;

    System.out.println("Hasil Tambah" + " " + (a + b));
    System.out.println("Hasil Kurang" + " " + (a - b));
    System.out.println("Hasil Kali" + " " + (a * b));
    System.out.println("Hasil Bagi" + " " + (a / b));
    System.out.println("Sisa Pembagian" + " " + (a % b));

    // Augmented Assignments
    int c = 100;

    c += 10;
    System.out.println("Hasil Augmented Assignments Tambah" + " " + (c));

    c -= 10;
    System.out.println("Hasil Augmented Assignments Kurang" + " " + (c));

    c *= 10;
    System.out.println("Hasil Augmented Assignments Kali" + " " + (c));

    c /= 10;
    System.out.println("Hasil Augmented Assignments Bagi" + " " + (c));

    c %= 10;
    System.out.println("Sisa Augmented Assignments Pembagian" + " " + (c));


    // Unary Operator
    int d = 100;
    d++;
    System.out.println(d);

    d--;
    System.out.println(d);


  }
  
}
