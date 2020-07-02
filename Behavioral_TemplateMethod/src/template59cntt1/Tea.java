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
public class Tea extends CaffeineBeverage{

    public Tea() {
    }

    @Override
    public void pourInCup() {
        super.pourInCup(); 
        System.err.println("Rót trà ra ly.");
    }

    @Override
    public void boilWater() {
        super.boilWater();     
        System.err.println("Nấu nước pha trà.");
    }
    
    @Override
    public void addCondiments() {
        super.addCondiments();   
        System.err.println("Thêm gừng hoặc chanh để trà thêm vị.");
    }

    @Override
    public void brew() {
        super.brew();   
        System.err.println("Pha lá trà với nước sôi.");
    }

    @Override
    public void prepareRecipe() {
        super.prepareRecipe();   
        System.err.println("Công thức pha trà như sau:");
        boilWater();
        pourInCup();
    }
}
