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
public abstract class AbstractFile {
    String name;
    String path;
    String prefix="";
    

    public AbstractFile( String name) {
        this.name=name;
        this.path=name;
    }
    
    public  abstract void add(AbstractFile f);
    public abstract void remove(AbstractFile f);
    public abstract String getTreeFolder();

    public String getPath() {
        return path;
    }
}
