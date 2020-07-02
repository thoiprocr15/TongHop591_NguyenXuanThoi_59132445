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
public class Chia implements ITinh{

    public Chia() {
    }

    @Override
    public float Tinh(float a, float b) {
        if(a == 0)
            return Float.NaN;
        else
            return a / b;
    }
    
}
