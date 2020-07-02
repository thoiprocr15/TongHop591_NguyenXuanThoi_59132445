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
public class Triangle extends Shape{

    public Triangle() {
    }
    
    
    @Override
    public String draw() {
        return "Trộn màu vàng" + getBrush() + "Chuẩn bị giấy" + getPaper() + "Lấy khung hình tam giác" + getFrame();
    }
    
}
