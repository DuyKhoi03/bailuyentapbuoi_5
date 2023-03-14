package Cau1;

public class CamCaoPhong extends Cam {
   public String xuatten(){
       return this.ten="camcaophong";
   }
   public double giabancamcaophong(){
       super.setGiaban(15000);
       return this.getGiaban()*this.getCannang();
   }

    double nextDouble() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    }

