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
 * fuentes
 * http://www.aprenderaprogramar.com/index.php?option=com_content&view=article&id=603:interface-list-del-api-java-clases-arraylist-linkedlist-stack-vector-ejemplo-con-arraylist-cu00917c&catid=58:curso-lenguaje-programacion-java-nivel-avanzado-i&Itemid=180
 * http://aprenderaprogramar.com/index.php?option=com_content&view=article&id=631:clase-arraylist-del-api-java-metodos-add-size-etc-concepto-de-clase-generica-o-parametrizada-cu00665b&catid=68:curso-aprender-programacion-java-desde-cero&Itemid=188
 * https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html
 * https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
 */
public interface Listas<E> {
    /**
     * 
     * definiendo metods para luego usarlos en otras clases
     * y que serviran como una interfaz entre estas mismas clases y otras
     */
    public int size();//servira para saber la longitud de la lista
    public void clear();//servira para limpiar toda la lista
    public boolean empty();//verifica si la lista esta vacia
    public void agregarPrimero(E valor);//agrega en la primera posicion el valor de entrada
    public void agregarUltimo(E valor);//agrega en la ultima posicion el valor de entrada
    public E getPrimero();//obtiene el valor en la posicion 0
    public E getUltimo();//obtiene el valor en la ultima posicion
    public E removePrimero();//remueve algun valor de cualquier posicion
    public E removeLast();//remueve el valor que esta en la ultima posicion
    public E removeElement(E valor);//remueve el elemento y lo devuelve
    public void agregar(E valor);//agrea un valor en una posicion
    public E getValor();//devuelve el valor en cualquier posicion
    public boolean contains(E valor);//verifica si hay un valor similar al que esta comparando y si esta devuelve true
    public int indexOf(E valor);//
    public int lastIndexOf(E valor);
    public E getPos(int i);//modifica el valor del elemento que esta en la posicion i
    public E setPos(int i, E o);//agrega un elemento en la posicion i
    public E addElim(int i, E o);//elimina el elemento de la posicion i retorna el elemento eliminiado
    public E remove(int i);//remueve y retorna el objeto encontado en la posicion
    public Iterator <E> iterator();
}
