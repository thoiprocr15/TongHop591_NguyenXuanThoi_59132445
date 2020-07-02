/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template59cntt1;

/**
 *
 * @author 张氏红绒
 */
public class Template59CNTT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CaffeineBeverage cf1 = new Coffee();
        cf1.prepareRecipe();
        cf1.brew();
        cf1.addCondiments();
        System.err.println("**********************");
        CaffeineBeverage t1 =  new Tea();
        t1.prepareRecipe();
        t1.brew();
        t1.addCondiments();
        
    }
    
}
