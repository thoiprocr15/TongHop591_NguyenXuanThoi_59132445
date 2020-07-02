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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GioHang gh1 = new GioHang();
       GioHang gh2 = new GioHang();      
       
       //2 hình thức thanh toán khác nhau: COD và Online
       gh1.setHinhThucTT(new ThanhToanCOD());
       gh2.setHinhThucTT(new ThanhToanOnline());
       
       //Danh sách hàng hóa
       HangHoa hh1 = new HangHoa("TiVi SamSung 50inch", 5000000, "chat luong tot, do phan giai 4k");
       HangHoa hh2 = new HangHoa("Tu Lanh Alaska", 5000000, "dung tich 20 lit, lam lanh nhanh");
       
       //Thêm hàng hóa vào giỏ hàng 1 (giỏ hàng thanh toán COD)
       gh1.themHangHoa(hh1);
       gh1.themHangHoa(hh2);
       
       //Thêm hàng hóa vào giỏ hàng 2 (giỏ hàng thanh toán Online)
       gh2.themHangHoa(hh1);
       gh2.themHangHoa(hh2);
       
       //In ra màn hình danh sách hàng hóa và tiền của giỏ hàng thanh toán COD
       System.out.println("Danh sach hang hoa cua gio hang 1: hinh thuc 'THANH TOAN COD'");
       gh1.setHienThi();
       System.out.println("Tong tien (VND): " + gh1.tinhTienHang());
       System.out.println("Tien khach hang phai tra (VND): " + gh1.tinhTienPhaiTra());
       
       //In ra màn hình danh sách hàng hóa và tiền của giỏ hàng thanh toán Online
       System.out.println("\n\nDanh sach hang hoa cua gio hang 2: hinh thuc 'THANH TOAN ONLINE'");
       gh2.setHienThi();
       System.out.println("Tong tien (VND): " + gh2.tinhTienHang());
       System.out.println("Tien khach hang phai tra (VND): " + gh2.tinhTienPhaiTra());
    }
    
}
