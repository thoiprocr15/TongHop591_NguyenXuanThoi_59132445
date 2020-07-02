/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTCalculate;

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
        Context ct = new Context();
    
        ct.setTinhToan(new Cong());
        System.out.println("75 + 12 = " + ct.Tinh(75, 12));
        
        ct.setTinhToan(new Tru());
        System.out.println("54 - 78 = " + ct.Tinh(54, 78));
    }
    
}
