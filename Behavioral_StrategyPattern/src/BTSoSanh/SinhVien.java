/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTSoSanh;

import java.util.Date;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class SinhVien {
    private String hoTen;
    private Date ngaySinh;
    private float diemTB;

    public SinhVien() {
        //Không tham số
    }
    //Có tham số
    public SinhVien(String hoTen, Date ngaySinh, float diemTB) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diemTB = diemTB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    //Hiển thị thông tin sinh viên
    public void hienThi(){
        System.out.println("Ho và ten sinh vien: " + hoTen);
        System.out.println("Ngay sinh: " + ngaySinh);
        System.out.println("Diem TB: " + diemTB);
    }
    
}
