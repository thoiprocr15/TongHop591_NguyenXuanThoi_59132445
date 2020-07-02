/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strutural_composite;

import java.util.ArrayList;

/**
 *
 * @author Nguyen Xuan Thoi
 */
public class Folder extends AbstractFile{
    public ArrayList<AbstractFile>list=new ArrayList<>();

    public Folder(String name) {
        super(name);
    }
    
   

    @Override
    public void add(AbstractFile f) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        list.add(f);
        f.path=this.path+"\\"+f.path;
        f.prefix=this.prefix+"...";
    }

    @Override
    public void remove(AbstractFile f) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     if(list.contains(f))
    {
        list.remove(f);
        return;
                
    }
     for(AbstractFile subFolder:list){
         subFolder.remove(f);
         
     }
    }

    @Override
    public String getTreeFolder() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    StringBuilder builder =new StringBuilder();
    builder.append(name);
    for(AbstractFile f: list)
    {
        builder.append("\n")
                .append(f.prefix)
                .append(f.getTreeFolder());
    }
    return builder.toString();
    
    }
    
}
