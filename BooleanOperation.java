public class BooleanOperation {
  public static void main(String[] args) {
    
    // && Operation
    /*
     * TRUE && TRUE  = TRUE
     * TRUE && FALSE = FALSE
     * FALSE && TRUE = FALSE
     * FALSE && FALSE = FALSE
     */

    // || Operation
    /*
     * TRUE || TRUE  = TRUE
     * TRUE || FALSE = TRUE
     * FALSE || TRUE = TRUE
     * FALSE || FALSE = FALSE
     */

    // ! Operation
    /*
     * ! TRUE = FALSE
     * ! FALSE = TRUE
     */
    
    var absen = 75;
    var nilaiAkhir = 80;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilaiAkhir = nilaiAkhir >= 75;

    var lulus = lulusAbsen && lulusNilaiAkhir;
    System.out.println(lulus);
  }  
}
