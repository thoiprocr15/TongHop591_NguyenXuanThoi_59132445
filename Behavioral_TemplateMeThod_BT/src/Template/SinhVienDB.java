/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class SinhVienDB extends EntityDB<SinhVien>{

    @Override
    protected SinhVien findById(int id) {
        for (SinhVien sv : list) {
            if (sv.maSV == id) {
                return sv;
            }
        }
        return null;
    }

    @Override
    protected int getKey(SinhVien t) {
        return t.maSV;
    } 
}
