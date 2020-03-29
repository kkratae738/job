package OOP;

public class Box1 {
     public double width, base, height;
    //----------------
    void displayName(){
        System.out.println("พายุรัตน์ คชรินทร์");
        System.out.println("คอมพิวเตอร์โปรแกรมเมอร์");
        System.out.println("krislovekris1990@gmail.com");
    }   
    //----------------------
    public double Tax(int price){
        double tax, vat=0.07;
        tax=price*vat;
        return tax;
    }
    //---------------------
    public double Triangle(){
        return 0.5 * height * base;
    }
    //---------------------
    public void Circle(int r){
        double area;
        area = 3.14*r*r;
        System.out.println("พื้นที่วงกลม"+ area);
    }
    //---------------------
    }

