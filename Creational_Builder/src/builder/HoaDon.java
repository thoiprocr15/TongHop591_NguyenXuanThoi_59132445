/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class HoaDon {
    
    HoaDonHeader header;
    List<CTHD> cthds = new ArrayList<>();
    
    public HoaDon() {
    }
    
    protected HoaDon(Builder builder) {
        this.header= builder.header;
        this.cthds= builder.cthds;
    }
    
    public static class Builder{
        HoaDonHeader header;
        List<CTHD> cthds = new ArrayList<>();

        public Builder() {
        }
        
        public Builder(HoaDonHeader header) {
            this.header = header;
        }
        
        public Builder addHeader(HoaDonHeader header)
        {
            this.header=header;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd)
        {
            this.cthds.add(cthd);
            return this;
        }
        
        public HoaDon build()
        {
            return new HoaDon(this);
        }
               
    }  
    @Override
        public String toString() {

            String s = header.toString();
            for (int i = 0; i < cthds.size(); i++) {
                CTHD get = cthds.get(i);
                s = s + "\n" + get.toString();
            }
            return s;
        }
}
