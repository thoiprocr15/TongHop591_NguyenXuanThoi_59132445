/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern59cntt1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class TiGia
{
    float tigia;
    List<LangNgheThayDoiTiGia> khs= new ArrayList<>();

    public TiGia(float tigia) {
        this.tigia = tigia;
    }

     public void them(LangNgheThayDoiTiGia kh)
            
    {
        if(!khs.contains(khs.contains(kh)))
            khs.add(kh);
    }
     public void xoa (LangNgheThayDoiTiGia kh){
         if(khs.contains(kh))
             khs.remove(kh);
     }
    
    public void thayDoiTiGia( float khoangtd)
    {
        
        tigia+=khoangtd;
      khs.forEach(kh ->
      {
          kh.capnhatTiGia(tigia);
          
      });
}
    public static interface LangNgheThayDoiTiGia
    {
        public void capnhatTiGia(float tigiaMoi);
    }

   
}
