public class NonPrimitiveDataType {
  public static void main(String[] args) {
    
    Integer iniInteger = 100;
    Long iniLong = 10000L;

    Byte iniByte = null;

    System.out.println(iniByte);

    iniByte = 100;
    System.out.println(iniByte);


    // Convertion Primitive to Non-Primitive
    int iniInt = 100;
    Integer iniInteger2 = iniInt;

    // Object
    Integer iniObject = iniInt;
    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();

    System.out.println(iniShort);

  }
  
}
