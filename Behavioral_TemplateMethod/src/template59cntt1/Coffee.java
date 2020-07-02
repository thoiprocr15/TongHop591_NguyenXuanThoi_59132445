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
public class Coffee extends CaffeineBeverage{

    public void Coffee() {
    }

    @Override
    public void pourInCup() {
        super.pourInCup(); 
        System.err.println("Rót cà phê ra tách nhẹ nhàng.");
    }

    @Override
    public void boilWater() {
        super.boilWater(); 
        System.err.println("Nấu nước sôi đến 100 độ C.");
    }

    
    @Override
    public void addCondiments() {
        super.addCondiments();
        System.err.println("Thêm đường và sữa vào cà phê.");
    }

    @Override
    public void brew() {
        super.brew();
        System.err.println("Pha cà phê với nước sôi.");
    }

    @Override
    public void prepareRecipe() {
        super.prepareRecipe();
        System.err.println("Công thức pha cà phê như sau:");
        boilWater();
        pourInCup();
        
    }

    
}
