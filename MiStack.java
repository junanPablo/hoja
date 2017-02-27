/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja;

/**
 *
 * @author Juan Pablo Merck
 * fuentes de info
 * http://www.taringa.net/posts/apuntes-y-monografias/14961317/Stack-pilas--java.html
 */
public interface MiStack <E>{
    /**metodos que seran usados por otras clases y sirve como una interface
     * entre clases para que interactuen
     *  
     */
    public void push(E Element);
    public E pop();
    public boolean empty();
    public int size();
    public E getE();
}
