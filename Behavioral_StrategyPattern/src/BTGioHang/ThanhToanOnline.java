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
public class ThanhToanOnline implements IThanhToan{

    public ThanhToanOnline() {
    }
    
    @Override
    public double thanhToan(int tienHang) {
        if(tienHang < 1000000)
            return tienHang * 0.95; //giảm 5%
        else
            return tienHang * 0.93; //giảm 7%
            
    }    
}
