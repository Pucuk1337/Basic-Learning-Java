public class NumberConvertion {
  public static void main(String[] args) {
    
    // Convertion Number Data Type
    
    // -- Widening Casting (Auto): byte -> short -> int ->long -> float -> double
    byte iniByte = 10;
    short iniShort = iniByte;
    int iniInt = iniShort;
    long iniLong = iniInt;
    float iniFloat = iniLong;
    double iniDoubel = iniFloat;
    

    // -- Narrowing Casting (Non): double -> float -> long -> int -> short -> byte 
    float iniFloat2 = (float) iniDoubel;
    long iniLong2 = (long) iniFloat2;
    int iniInt2 = (int) iniLong2;
    short iniShort2 = (short) iniInt2;
    byte iniByte2 = (byte) iniShort2;


  }
}
