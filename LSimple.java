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
public class LSimple<E> extends AbLista<E> {
    //atributo
    protected Nodo<E> cabeza; //mi referencia
    protected int contador;//contador de la longitud que va a tener
    //constructor
    public LSimple(){
        cabeza = null;
        contador =0;
    }
    
    
    @Override
    public int size() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return contador;
    }

    @Override
    public void clear() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean empty() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return contador ==0;
    }

    @Override
    public void agregarPrimero(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        cabeza = new Nodo<E>(valor,cabeza);
        contador ++;
    }

    @Override
    public void agregarUltimo(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo <E> temporal = new Nodo <E>(valor,null);
        if(cabeza != null){
            Nodo<E> p = cabeza;
            while(p.proximo() != null){
                p = p.proximo();
            }
            p.setProximo(temporal);
        }else{
            cabeza = temporal;
        }
        contador ++;
    }

    @Override
    public E getPrimero() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return cabeza.valor();
    }

    @Override
    public E getUltimo() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> miNodo = new Nodo<E>(null);
        if(cabeza != null){
            Nodo<E> p = cabeza;
            while(p.proximo() != null){
                p = p.proximo();
            }
            return (E) p;
        }else{
            return null;
        }
    }

    @Override
    public E removePrimero() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> temporal = cabeza;
        cabeza = cabeza.proximo();
        contador--;
        return temporal.valor();
    }

    @Override
    public E removeLast() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> p = cabeza;
        Nodo<E> anterior = null;
        while(p.proximo() != null){
            anterior = p;
            p=p.proximo();
        }
        if(anterior == null){
            cabeza = null;
        }else{
            anterior.setProximo(null);
        }
        contador--;
        return p.valor();
    }

    @Override
    public E removeElement(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> p = cabeza;
        Nodo<E> anterior = null;
        while(p.proximo() != null && !p.proximo().equals(valor)){
            anterior = p;
            p=p.proximo();
        }
        if(p !=null){
            if(anterior == null){
                cabeza = p.proximo();
            }else{
                anterior.setProximo(p.proximo());
            }
            contador --;
            return p.valor();
        }
        else{
            return null;
        }
    }

    @Override
    public void agregar(E valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getValor() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public boolean contains(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Nodo<E> p = cabeza;
        while(p!=null && !p.valor().equals(valor)){
            p=p.proximo();
        }
        return p !=null;
    }

    @Override
    public int indexOf(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int indice = 0;
        Nodo<E> p = cabeza;
         while (p !=null){ 
          if (p.equals(valor)){
            return indice;
          }

          indice++;
          p = p.proximo();
        }
       return -1;
    }

    @Override
    public int lastIndexOf(E valor) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 0;
    }

    @Override
    public E getPos(int i) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
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
    public String toString(){
        Nodo<E> p = cabeza;
        String miCadena = "";
        while(p.proximo() != null){
            miCadena+=p.valor()+" ";
            p=p.proximo();
        }
        return miCadena;
    }
}
