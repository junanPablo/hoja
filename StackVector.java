/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

import java.util.Vector;

/**
 *
 * @author Juan Pablo Merck
 * http://www.sc.ehu.es/sbweb/fisica/cursoJava/fundamentos/colecciones/vector.htm
 * 
 */
public class StackVector <E> extends AbStack <E> {
    //atributos
    protected Vector<E> miVector;
    
    //constructor
    public StackVector(){
        miVector = new Vector <E>();
    }
    
    /**implementando los metodos que hacen referencia a Mi stack pero
     * faltan por definir
     */
    @Override
    public void push(E Element) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        miVector.add(Element);
    }

    @Override
    public E pop() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        E valor = miVector.lastElement();
        miVector.remove(valor);
        return valor;
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
