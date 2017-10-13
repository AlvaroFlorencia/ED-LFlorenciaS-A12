package ed.list;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Node<T> { //<T> genérico
    T data;  //Atributos
    Node next;  
    
   public Node(){ //Constructor pot defecto
    next=null;
}



public Node(T d){  //Constructor con un elemento
    data=d;
    next=null;
}



public  void print(){
     System.out.println(data+ "->"); //Imprime datos del nodo
}



void printS(){
    System.out.println(data+"↓"); //Imprime datos del nodo para la pila
}

}

