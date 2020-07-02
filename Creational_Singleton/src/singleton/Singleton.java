/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory sf = ShapeFactory.Instance();
        Shape Cirle = sf.createShape(ShapeType.circle);
       Cirle.setBrush("\n");
       Cirle.setFrame("\n");
       Cirle.setPaper("\n");
        System.out.println("Draw Circle Recipe");
        System.out.println(Cirle.draw());
    }
}
