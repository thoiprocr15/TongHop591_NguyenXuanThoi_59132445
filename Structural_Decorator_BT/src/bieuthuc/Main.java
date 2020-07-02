/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bieuthuc;

import BieuThuc1.BieuThuc;
import BieuThuc1.BieuThucDonGian;
import BieuThuc1.Chia;
import BieuThuc1.Cong;
import BieuThuc1.Nhan;
import BieuThuc1.Tru;


/**
 *
 * @author 张氏红绒
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc bt1 = new BieuThucDonGian(10);
        bt1 = new Cong(5, bt1);
        bt1 = new Tru(4, bt1);
        bt1 = new Nhan(3, bt1);
        bt1 = new Chia(2, bt1);
        
        System.out.println(bt1.bieuThuc()+ "=" +bt1.giaTri());
    }

    
}
