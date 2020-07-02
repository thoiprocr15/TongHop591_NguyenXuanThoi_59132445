/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strutural_composite;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class Strutural_Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFile root =new Folder("Data");
        AbstractFile toanFolder =new Folder("Toán");
        AbstractFile LyFolder =new Folder("Lý");
        AbstractFile HoaFolder =new Folder("Hóa");
        AbstractFile Daiso =new File("Toán A");
        AbstractFile Giaitich =new File("Toán B");
        AbstractFile TiengAnhFolder =new Folder("MyELT");
        AbstractFile ChuyenNganh= new File("Tiếng Anh CNTT");
        root.add(TiengAnhFolder);
        TiengAnhFolder.add(ChuyenNganh);
        System.out.println(root.getTreeFolder());
        System.out.println(ChuyenNganh.path);
    }
    
}
