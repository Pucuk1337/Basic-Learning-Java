public class OverloadingMethod {
  public static void main(String[] args) {
    sayHello();
    sayHello("Pucuk");
    sayHello("Peko", "Pucuk");
  } 
  static void sayHello(){
    System.out.println("Hello!");
  } 
  static void sayHello(String name){
    System.out.println("Hello " + name);
  }
  static void sayHello(String firstname, String lastName){
    System.out.println("Hello " + firstname + " " + lastName);
  }
}
