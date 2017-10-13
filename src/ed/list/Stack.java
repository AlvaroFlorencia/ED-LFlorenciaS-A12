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
public class Stack<T> {
    //Atributos
     private Node<T> top;  //Atributos
     private int size;
    public void Stack(){  //Constructor sin parámetros
    top=null;  //Se inicializan los atributos
    size=0;
}
public void Stack(T d){ //Constructor que recibe nodo
    
    Node<T> node= new Node(d);  //Se crea un nuevo nodo
    
    top=node;  //El nodo se vuelve el tope (cima)
    size=1;  //Y size se vuelve 1
}
//Devuelve el size
public int getSize(){
    return size;
}
//Pone un nuevo nodo en la cumbre de la pila
public void push(T d){ //Si es el primer nodo va a apuntar a null  ,no se necesita preguntar si està vacìa
    Node<T> node = new Node(d);
    node.next=top;  //EL nodo se enlaza con el top
    top=node; //Top se vuelve el nodo
    size++; //SE Incrementa el size
}
//Devuelve el último valor y lo quita de la pila 
public T pop(){
    T d;  //Se instancia el nodo
    if (!isEmpty()){  //Se checa si està vacìa 
        d = top.data;  //Se guarda el valor del último
        top=top.next;  //Se enlaza al al "de abajo" y se elimina 
        size--;
    }else{
        d=null;
    }
    return d;  //Se regresa el dato
}
//Solo muestra el valor de la cima

public T getTop(){
    if (!isEmpty()){ //Se checa si está vacía 
        return top.data;} //Se regresa el dato de la cima
    else{
        return null;  //Si no se regresa null
        }
}
//Muestra los datos de cada nodo dentro de la pila
public void showStack(){
    Node<T> t = top;  //Se instacia un nodo
    while (t!=null){ //cuando t apunte a null va ser falso(Mientras exista)
        t.toString();  //Se regrea el to string
        t=t.next;  //Y se va avanzando la pila
    }
    System.out.println("NULL");
}
//Muestra si la pila está vacía
public boolean isEmpty(){
    return size==0;  //Regresa true si size es 0
}
}
