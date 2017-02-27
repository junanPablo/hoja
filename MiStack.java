/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja4;

/**
 *
 * @author Juan Pablo Merck
 * Referencias
 * http://www.w3api.com/wiki/Java:Stack
 * http://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=608:la-estructura-de-datos-pila-en-java-clase-stack-del-api-java-ejemplo-simple-y-ejercicios-resueltos-cu00923c&catid=58:curso-lenguaje-programacion-java-nivel-avanzado-i&Itemid=180
 */
public interface MiStack<E> {
    
    public void Push(E Element);
    public E Pop();
    public boolean vacio();
    public int Size();
    public E getStack();
}
