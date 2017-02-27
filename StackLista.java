/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;



/**
 *
 * @author Juan Pablo Merck
 */
public class StackLista<E> extends AbStack<E> {
    //atributos
    protected AbLista <E> MiLista;
    protected int queTipo;
    //protected Factory FacL = new Factory();
    
    
    public StackLista(int a){
        queTipo = a;
        //MiLista = FacL.
    }
    
    
    @Override
    public void push(E Element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
