/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author 张氏红绒
 */
public class SinhVien {
    String tenSV, queQuan, ngaySinh;
    
    public SinhVien(String tenSV, String queQuan, String ngaySinh) {
        
        this.tenSV = tenSV;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "tenSV=" + tenSV + ", queQuan=" + queQuan + ", ngaySinh=" + ngaySinh + '}';
    }

    
    
    
}
