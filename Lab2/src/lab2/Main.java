
package lab2;

public class Main {

    public static void main(String[] args) {
        System.out.println("welcom to programming");
            
            Box1 box = new Box1();
            Box2 mul = new Box2();
            box.h= 10.00;
            box.w= 5.00;
            box.d= 3.00;
            System.out.println(box.volume());
            System.out.println("พื้นที่สามเหลี่ยม"+ box.triangle());
            
            mul.x=7;
            mul.multiply();
    
    }
    
}
