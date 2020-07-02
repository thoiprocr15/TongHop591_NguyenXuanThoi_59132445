/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza.ny;

import pizza.Pizza;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class NYClamStyle extends Pizza
{
    public NYClamStyle()
    {
        pizzaStr ="Chào các bạn! Đây là bánh pizza Clam kiểu New York\n";
    }

    @Override
    public void prepare()
    {
        pizzaStr += "Chuẩn bị bột và Clam và Muối\n";
    }

    @Override
    public void bake()
    {
        pizzaStr += "Nướng ở 220 độ C trong 18 phút\n";
    }
}
