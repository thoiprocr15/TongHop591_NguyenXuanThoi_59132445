/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTGioHang;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class HangHoa {
    private String tenHH;
    private int gia;
    private String moTa;

    public HangHoa() {
        //Không tham số
    }
    //Có tham số
    public HangHoa(String tenHH, int gia, String moTa) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.moTa = moTa;
    }
    //Các phương thức get, set
    public String getTenHH() {
        return tenHH;
    }

    public int getGia() {
        return gia;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }
    //Hiển thị thông tin hàng hóa
    public void hienthi(){
        System.out.println("Ten hang hoa: " + tenHH);
        System.out.println("Gia (VND): " + gia);
        System.out.println("Mo ta: " + moTa);
    }
   
}
