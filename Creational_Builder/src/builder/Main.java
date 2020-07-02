/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        HoaDonHeader hd1 = new HoaDonHeader("HD01", "30-06-2020", "Nguyễn Xuân Thời") ;
        
        CTHD cthd1 = new CTHD("SP01", "Tivi_24Inch", 1, 5000000, 0.5f);
        CTHD cthd2 = new CTHD("SP02", "Máy Giặt", 2, 8000000, 0.1f);
        CTHD cthd3 = new CTHD("SP03", "Tủ Lạnh", 2, 1000000, 0.2f);
        
        //In hóa đơn ra màn hình (Builder Pattern)
        HoaDon hd = new HoaDon.Builder()
                .addHeader(hd1)
                .addCTHD(cthd1)
                .addCTHD(cthd2)
                .addCTHD(cthd3)
                .build();
        System.out.println(hd.toString());
   }
    
}
