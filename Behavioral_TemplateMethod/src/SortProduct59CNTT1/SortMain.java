/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortProduct59CNTT1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class SortMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Product> list = new ArrayList<>();
        list.add(new Product("Sáo",25000,25));
        list.add(new Product("Tiêu",40000,38));
        list.add(new Product("Kèn",15000,40));
        
        SortCollection s1 = new SortProductByName();
        SortCollection s2 = new SortProductByPrice();
        
        System.out.println("Sắp xếp theo tên:");
        s1.SX(list);
        s1.Display(list);
    }
    
}
