/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTGioHang;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class GioHang {
    //HangHoa dsHH;
    IThanhToan hinhThucTT;
    
    //Mảng chứa danh sách hàng hóa
    ArrayList<HangHoa> dshh = new ArrayList<>();

    public GioHang() {
    }

    public GioHang(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public IThanhToan getHinhThucTT() {
        return hinhThucTT;
    }

    public ArrayList<HangHoa> getDshh() {
        return dshh;
    }

    public void setHinhThucTT(IThanhToan hinhThucTT) {
        this.hinhThucTT = hinhThucTT;
    }

    public void setDshh(ArrayList<HangHoa> dshh) {
        this.dshh = dshh;
    }
      
    //Thêm hàng hóa vào giỏ hàng
    public void themHangHoa(HangHoa hh){
        dshh.add(hh);
    }
    
    //Tính tổng tiền hàng hóa của giỏ hàng
    public int tinhTienHang(){
        int tong = 0;
        for (int i = 0; i < dshh.size(); i++) {
            HangHoa get = dshh.get(i);
            tong = tong + get.getGia();
        }
        return tong;
    }
    
    //Tính tổng tiền khách hàng phải trả (tùy hình thức thanh toán khác nhau)
    public double tinhTienPhaiTra(){
        return hinhThucTT.thanhToan(tinhTienHang());
    }
    
    //Hiện thị danh sách các hàng hóa trong giỏ hàng
    public void setHienThi(){
        for (int i = 0; i < dshh.size(); i++) {
            HangHoa get = dshh.get(i);
            System.out.println("*Hang hoa thu " + (i+1));
            get.hienthi();
        }
    }
}
