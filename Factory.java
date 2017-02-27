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
public class Factory {
    //mi construcotr
    public Factory(){
        
    }
    /*
    cuando el usuario decide en que tipo de stack le gustaria
    guardar si en StackVector, StackArrayList o StackLista
    */
    public AbStack getStack(int op1, int op2){
        if(op1==1){
            return new StackVector<Integer>();
        }else if(op2==2){
            return new StackAL<Integer>();
        }else{
            return new StackLista<Integer>(op1);
        }
    }
    public AbLista getL(int op1){
        if(op1==1){
            return new LSimple();
        }else if(op1==2){
            return new LCircular();
        }else{
            return new LDoble();
        }
    }
}
