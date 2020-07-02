/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BieuThuc1;

/**
 *
 * @author 张氏红绒
 */
public class Chia extends BieuThucDecorator{
    int toanHang;

    public Chia(int toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        if(toanHang == 0) return 1;
        return bt.giaTri() / toanHang; 
    }

    @Override
    public String bieuThuc() {
        return bt.bieuThuc() + "/" + toanHang; //To change body of generated methods, choose Tools | Templates.
    }

}
