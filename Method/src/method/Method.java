package method;
import java.util.Scanner;

public class Method {
    public double netprice,vat,disc;

    public static void main(String[] args) {
        int price;
        Method m = new Method();
        Scanner rd = new Scanner(System.in);
        Employee();
        System.out.println("ราคาสินค้า"); 
        price = rd.nextInt();
        System.out.println("Vat "+m.Vat(price,0.07));
        System.out.println("Disc "+m.Disc(price,10));
        
    }
    
    public static void Employee(){
        int age=21;
        String name="Payurat Khodcharin";
        float gpa=3.25f;
        System.out.println("ชื่อ "+name+"\nอายุ "+age+"\nเกรด "+gpa);
    }
    
    public double Vat(int price,double tax){
        vat=tax*price;
        return vat;
    }
    
    public double Disc(int price, double dis){
        disc=price*(dis/100);
        return disc;
    }
}
