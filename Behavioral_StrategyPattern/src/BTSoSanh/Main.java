/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTSoSanh;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        QLSV ql = new QLSV();
        
        //Danh sách sinh viên
        SinhVien sv1 = new SinhVien("Nguyen Van B", new SimpleDateFormat("dd/mm/yyyy").parse("1/1/1999"), (float)5.5);
        SinhVien sv2 = new SinhVien("Nguyen Van H", new SimpleDateFormat("dd/mm/yyyy").parse("2/2/1999"), 8);
        SinhVien sv3 = new SinhVien("Nguyen Van M", new SimpleDateFormat("dd/mm/yyyy").parse("3/3/1999"), 10);
        SinhVien sv4 = new SinhVien("Nguyen Van A", new SimpleDateFormat("dd/mm/yyyy").parse("4/4/1999"), (float)7.5);
        
        //Thêm sinh viên
        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);
        
        //Sắp xếp theo "tên" sinh viên và in ra danh sách ra màn hình 
        ql.setSoSanh(new SoSanhTheoTen());
        System.out.println("Danh sach sinh vien duoc so sanh theo ten:");
        ql.sapXep();
        ql.inDS();
        
        //Sắp xếp theo "điểm" sinh viên và in ra danh sách ra màn hình 
        ql.setSoSanh(new SoSanhTheoDiem());
        System.out.println("\n\nDanh sach sinh vien duoc so sanh theo diem:");
        ql.sapXep();
        ql.inDS();
    }
    
}
