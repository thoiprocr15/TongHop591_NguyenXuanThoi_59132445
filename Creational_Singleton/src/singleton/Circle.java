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
public class Circle extends Shape{

   

    public Circle() {
    }
      
    
    @Override
    public String draw() {
        return "Trộn màu xanh" + getBrush() + "Chuẩn bị giấy" + getPaper() + "Lấy khung hình tròn" + getFrame();
    }
    
    
}
