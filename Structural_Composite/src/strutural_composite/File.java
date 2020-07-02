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
public class File extends AbstractFile{
   

    public File(String name) {
        super(name);
    }
    
    @Override
    public void add(AbstractFile f) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public void remove(AbstractFile f) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    @Override
    public String getTreeFolder() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.name;
    }
}
