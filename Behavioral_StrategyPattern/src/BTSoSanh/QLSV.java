/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTSoSanh;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class QLSV{  
    ISoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> ds = new ArrayList<>();
    
    public QLSV() {
        //Không tham số
    }
    
    public QLSV(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public ISoSanh<SinhVien> getSoSanh() {
        return soSanh;
    }

    public ArrayList<SinhVien> getDs() {
        return ds;
    }

    public void setSoSanh(ISoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public void setDs(ArrayList<SinhVien> ds) {
        this.ds = ds;
    }
    
    public void themSinhVien(SinhVien sv){
        ds.add(sv);
    }
    //Sắp xếp danh sách sinh viên theo chiều tăng dần
    public void sapXep(){
        for (int i = 0; i < ds.size()-1; i++) {
            SinhVien get = ds.get(i);
            for (int j = i + 1; j < ds.size(); j++) {
                SinhVien get1 = ds.get(j);
                if(soSanh.soSanh(get, get1) == 1){
                    Collections.swap(ds, i, j);
                }               
            }          
        }
    }
    //In danh sách sinh viên
    public void inDS(){
        for (int i = 0; i < ds.size(); i++) {
            SinhVien get = ds.get(i);
            System.out.println("*Sinh vien thu " + (i+1));
            get.hienThi();
        }
    }
}
