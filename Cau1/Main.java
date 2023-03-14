package Cau1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Cam");
        System.out.println("2. CamSanh");
        System.out.println("3. QuaTao");
        System.out.println("4. CamCaoPhong");
        System.out.println("Chon chuc nang");
        Scanner sc= new Scanner (System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                Cam c= new Cam();
                System.out.println(""+c.xuatten());
                System.out.println("nhap so kg");
                c.setCannang(sc.nextDouble());
                System.out.println("gia ban la"+c.giabancam());
                break;
            case 2:
                CamSanh cs= new CamSanh();
                System.out.println(""+cs.xuattencamsanh());
                System.out.println("nhap so kg");
                cs.setCannang(sc.nextDouble());
                System.out.println("giabanla"+cs.giabancamsanh());
                break;
            case 3:
                QuaTao qt= new QuaTao();
                System.out.println(""+qt.xuatten());
                System.out.println("nhap so kg");
                qt.setCannang(qt.nextDouble);
                System.out.println("giabanla"+qt.giabantao());
                break;
            case 4 :
                CamCaoPhong ccp= new CamCaoPhong();
                System.out.println(""+ccp.xuatten());
                System.out.println("nhap so kg");
                ccp.setCannang(ccp.nextDouble());
                System.out.println(""+ccp.giabancam());
                break;
            default:
                System.out.println("ban da nhap sai");
                
                
                
                
                
                
                
        }
                
               
 
        
    }
    
}
