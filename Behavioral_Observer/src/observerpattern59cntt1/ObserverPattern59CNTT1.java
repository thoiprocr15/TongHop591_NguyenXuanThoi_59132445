
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class ObserverPattern59CNTT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

// TODO code application logic here
    TiGia tg =new TiGia(100);
    NhaDauTuA a =new NhaDauTuA(100);
    NhaDauTuB b= new NhaDauTuB(100);
    a.dangky(tg);
    b.dangky(tg);
    while(true){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập khoảng thay đổi tỷ giá:");
        float f =  scanner.nextFloat();
        tg.thayDoiTiGia(f);
        System.out.println("Tiếp tục : Nhấn(yes/no):");
        String kt = scanner.next();
        if(kt.equalsIgnoreCase("No"))
            break ;
        }
    }
    
}
