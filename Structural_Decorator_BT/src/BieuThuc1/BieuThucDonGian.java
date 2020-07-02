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
public class BieuThucDonGian extends BieuThuc{
    float toanHang;

    public BieuThucDonGian() {
    }

    public BieuThucDonGian(float toanHang) {
        this.toanHang = toanHang;
    }   

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
       StringBuilder builder = new StringBuilder();
       builder.append(toanHang);
       return builder.toString();
    }
  
}
