package Cau1;

public class CamSanh extends Cam {
    public String xuattencamsanh(){
        return this.ten="camsanh";
    }
    public double giabancamsanh(){
        super.setGiaban(10000);
        return this.getGiaban()*this.getCannang();
    }           
}
