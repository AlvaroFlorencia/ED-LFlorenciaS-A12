/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.list;

/**
 *
 * @author Dell
 */
public class Queue <T> {
    Node<T> front,rear;
    int size;
public void Queue(){  //Construtot por defecto
    front=rear=null;  //Front inicio,rear ùltimo
    size=0;
}
public void Queue(T d){ //Construtot con dato
    Node<T> node = new Node<T>(d);
    front=rear=node; //front y rear apuntan a nodo  
    size =  1;
}


public void enqueue(T d){
    Node<T> node = new Node<T>(d); //Creamos el nodo
    if(isEmpty()){
        front=rear=node;  ///Si està vació(lo mismo que en el constructor)
        size=1;
    }else{
        rear.next=node; ///El siguiente de rear es igual nodo
        rear=node; //y el rear es el nodo nuevo
        size++;
    }
}


 public T dequeue(){
    if (isEmpty()){ //Se pregunta si está vacñio
       
        return null;  //regresamos nulo
    }else{
        Node<T> fd=front;  //Apuntoador de front tipo generico ,para no poderde la ubicación de memoria
        front=front.next;  //Se elimina el nodo
        size--;             //Se decrementa el size    
        return fd.data;  //Regresamos el data
    }
}


public T getFront(){
    if (isEmpty()){  //Se pregunta si està vacìa
        return null; //Se regresa null
    }else{
        return front.data;  //Se regresa el dato de front
    }
}


public int getSize(){
    return size;  //Regreza size
}


boolean isEmpty(){ //Si size es 0 se regresa true
    return size==0;
}


public void clearQueue(){  //Para eliminar el queue front,fear y size se vuelven 0  ,
    front=rear=null;
    size=0;
}


public void showQueue(){
    System.out.println("front->");   //Se imprime "front"
    Node<T> p = front; //Se crea un nodo temporar en front
    if (p==null){
        System.out.println("NULL");  //Si front es null, es decir un queue vacía,se regresa null
    }
    while(p!=null){ //mientras p sea difente de null
        p.print(); //Se imprime el nodo
        p=p.next; //Se va avanzando
    }
    System.out.println("<-rear"); //Se imprime "rear"
}
    
}
