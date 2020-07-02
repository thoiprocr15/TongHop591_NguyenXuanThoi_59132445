/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author 张氏红绒
 */
public class TableAdapter {
    
    public static TableModel listAdapter(ArrayList<SinhVien> listSV)
    {
        DefaultTableModel tableModel = null;
        Vector data = new Vector();
        Vector header = new Vector<>();
        
        for(SinhVien sv: listSV)
        {
            Vector row = new Vector();
            row.add(sv.tenSV);
            row.add(sv.queQuan);
            row.add(sv.ngaySinh);
            data.add(row);
        }
        
        header.add("Tên");
        header.add("Quê quán");
        header.add("Ngày sinh");
        tableModel = new DefaultTableModel(data, header);
        return tableModel;
    }
}
