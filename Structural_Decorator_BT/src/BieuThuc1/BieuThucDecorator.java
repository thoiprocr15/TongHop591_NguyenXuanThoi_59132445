/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BieuThuc1;

/**
 *
 * @author 张氏红绒
 */
public abstract class BieuThucDecorator extends BieuThuc{
    BieuThuc bt;

    public BieuThucDecorator(BieuThuc bt) {
        this.bt=bt;
    }
      
}
