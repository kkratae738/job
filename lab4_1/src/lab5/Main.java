
package lab5;

public class Main {

    public static void main(String[] args) {
        Calcuulator cal = new Calcuulator();//คำสั่งเรียกมาใช้
        
        cal.Multiply();//คำสั่งแสดงผลจาก Class Calcuulator
        cal.Add(2, 5);
        System.out.println("ผลลัพธ์"+cal.OddEven());
        System.out.println("ผลลัพธ์"+cal.Grabe(10, 10, 10, 10));
    }
    
}
