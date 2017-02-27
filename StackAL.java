/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

import java.util.ArrayList;

/**
 *
 * @author Juan Pablo Merck
 */
public class StackAL<E> extends AbStack<E> {
    //atributos
    protected ArrayList<E> miArrayL;
    
    
    //constructor e inicializandolo
    public StackAL(){
        miArrayL = new ArrayList();
    }
    
    
    /**implementando los metodos que hacen referencia a Mi stack pero
     * faltan por definir
     */
    @Override
    public void push(E Element) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        miArrayL.add(Element);
    }

    @Override
    public E pop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return miArrayL.remove(miArrayL.size()-1);
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
