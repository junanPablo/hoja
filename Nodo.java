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
class Nodo<E> {
    protected E datos;
    protected Nodo<E> nextElement;
    
    public Nodo(E valor, Nodo<E> siguiente){
        datos = valor;
        nextElement = siguiente;
    }
    public Nodo(E valor){
        this(valor,null);
    }
   public Nodo<E> proximo(){
       return nextElement;
   }
   public void setProximo(Nodo<E> siguiente){
       nextElement = siguiente;
   }
   public E valor(){
       return datos;
   }
   public void setValor(E valor){
       datos = valor;
   }
}
