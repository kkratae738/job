package OOP;

public class Main {

    public static void main(String[] args) {
    Box1 b = new Box1();
    System.out.println("ภาษี" +b.Tax(1000));
    b.width=10;
    b.base=20;
    System.out.println("พื้นที่สามเหลี่ยม" +b.Triangle());
    b.Circle(100);
   }

}   
