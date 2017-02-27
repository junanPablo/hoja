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
public class NodoDoble<E> {
    protected E datos;
    protected NodoDoble<E> prev;
    protected NodoDoble<E> sig;
    
    public NodoDoble(E valor, NodoDoble<E> previo, NodoDoble<E> siguiente){
        datos = valor;
        prev = previo;
        sig=siguiente;
        if(prev!=null){
            prev.sig=this;
        }
        if(sig!=null){
            sig.prev=this;
            prev=previo;
        }
    }
    
    public NodoDoble(E valor){
        this(valor,null,null);
    }
    public NodoDoble<E> mSiguiente(){
        return sig;
    }
    public E valor(){
        return datos;
    }
    public NodoDoble<E> mAnterior(){
        return prev;
    }
    public void setSig(NodoDoble<E> siguiente){
        sig = siguiente;
    }
}
