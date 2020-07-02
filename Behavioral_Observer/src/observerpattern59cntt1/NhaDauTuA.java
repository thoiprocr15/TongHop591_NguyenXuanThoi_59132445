/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt1;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class NhaDauTuA implements TiGia.LangNgheThayDoiTiGia
{
    float tigia;
    public NhaDauTuA(float tigia) {
        this.tigia = tigia;
    }
    public  void dangky(TiGia tiGia)
    {
        tiGia.them(this);
    }
    public void huydangky(TiGia tiGia)
    {
     tiGia.xoa(this);
    }

    @Override
    public void capnhatTiGia(float tigiaMoi) {
        if(tigiaMoi> tigia)
            System.out.println("Nhà đầu tư A : Bán ra ");
        else
            if(tigiaMoi ==tigia)
            System.out.println("Nhà đầu tư A : Bán ra ít ");
             else
                System.out.println("Nhà đầu tư  : Mua vào");
         tigia=tigiaMoi;
    tigia=tigiaMoi;
    }
    
}

