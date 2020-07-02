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
public class Tru extends BieuThucDecorator{
    float toanHang;

    public Tru(float toanHang, BieuThuc bt) {
        super(bt);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bt.giaTri() - toanHang; 
    }

    @Override
    public String bieuThuc() {
        return bt.bieuThuc() + "-" + toanHang; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
