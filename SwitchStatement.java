public class SwitchStatement {
  public static void main(String[] args) {
    
    var nilai = "A";

    switch(nilai) {
      case "A":
        System.out.println("Wow, Selamat!, Anda Lulus dengan Baik!");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Cukup Baik");
        break;
      case "D":
        System.out.println("Anda Tidak Lulus!");
        break;
      default:
        System.out.println("Mungkin anda Salah Jurusan!");
    }

    // Switch with Lambda Expression
    switch(nilai){
      case "A" -> System.out.println("Wow, Selamat!, Anda Lulus dengan Baik!");
      case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
      case "D" -> System.out.println("Anda Tidak Lulus!");
      default -> System.out.println("Mungkin anda Salah Jurusan!");
    }

    // Without Yield
    String ucapan;
    switch (nilai){
    case "A" -> ucapan = "Wow, Selamat!, Anda Lulus dengan Baik!";
      case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
      case "D" -> ucapan = "Anda Tidak Lulus!";
      default -> ucapan = "Mungkin anda Salah Jurusan!";
    }
      System.out.println(ucapan);

    // With Yield
    ucapan = switch (nilai) {
      case "A":
        yield "Wow, Selamat!, Anda Lulus dengan Baik!";
      case "B", "C":
        yield "Nilai Anda Cukup Baik";
      case "D":
        yield "Anda Tidak Lulus!";
      default:
        yield "Mungkin anda Salah Jurusan!";
    };
    System.out.println(ucapan);
  }  
}
