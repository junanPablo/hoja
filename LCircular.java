/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

import java.util.Iterator;

/**
 *
 * @author Juan Pablo Merck
 */
public class LCircular<E> extends AbLista<E> {
    //ATRIBUTOS
    protected Nodo<E> cola;
    protected int contador;
    
    public LCircular(){
        cola = null;
        contador = 0;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean empty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void agregarPrimero(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> temporal = new Nodo<E>(valor);
        if(cola ==null){
            cola = temporal;
            cola.setProximo(cola);
        }else{
            temporal.setProximo(cola.proximo());
            cola.setProximo(temporal);
        }
        contador ++;
    }

    @Override
    public void agregarUltimo(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        agregarPrimero(valor);
        cola = cola.proximo();
    }

    @Override
    public E getPrimero() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cola.proximo().valor();
    }

    @Override
    public E getUltimo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cola.valor();
    }

    @Override
    public E removePrimero() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> temporal=null;
        if(cola == cola.proximo()){
            temporal = cola.proximo();
            cola = null;
        }else if(cola !=cola.proximo()){
            temporal = cola.proximo();
            cola.setProximo(cola.proximo().proximo());
        }
        contador--;
        return temporal.valor();
    }

    @Override
    public E removeLast() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> p = cola;
        while(p.proximo()!=cola){
            p = p.proximo();
        }
        Nodo<E> temporal=cola;
        if(p == cola){
            cola = null;
            cola = null;
        }else{
            p.setProximo(cola.proximo());
            cola = p;
        }
        contador--;
        return temporal.valor();
    }

    @Override
    public E removeElement(E valor) {
      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates            
    }

    @Override
    public void agregar(E valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getValor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> p = cola;
        while (p!=null && !p.valor().equals(valor)){
            p.proximo();
        }
        return p !=null;
    }

    @Override
    public int indexOf(E valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(E valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getPos(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E setPos(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E addElim(int i, E o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
