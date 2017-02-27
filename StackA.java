/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4;
import java.util.ArrayList;
/**
 *
 * @author Juan Pablo Merck
 */
public class StackA <E> extends AbStack <E> {
    
    //atributo
    protected ArrayList <E> miArray;
    
    //constructor
    public StackA(){
        miArray = new ArrayList();
    }

    @Override
    public void Push(E Element) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        miArray.add(Element);
    }

    @Override
    public E Pop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int actual = miArray.size();
        return miArray.remove(actual-1);
    }

    @Override
    public boolean vacio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getStack() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
