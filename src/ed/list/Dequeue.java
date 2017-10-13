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
public class Dequeue<T> {
    private NodeDL front;
    private NodeDL rear; //Apuntadores a delante y atrás de tipo Nodo con doble enlace
    private int size;   //Tamaño del Deque
    
    public Dequeue(){
      front=null; //COnstructor si parámetos incin en null/cero
      rear=null;
      size=0;
    }
    public Dequeue(T d){   
      front=rear=new NodeDL(d);  //Front y rear se vuelven el nuevo nodo debido a que se inicia el dequeue
      size=1; //Size es igual 1
    }
    //Inserta un elemento al inicio
    public void enqueueFront(T d){
      NodeDL node = new NodeDL(d);  //Se crea el nodo
      if(isEmpty()){  //Checa si esta vacia 
        front=rear=node; //Si está vacia  como en el constructor nodo se vuelve el front y el rear
      }else{
      node.next=front;    //El nuevo nodo apunta al front
      front.back=node; //Y el front back apunta al nodo
      front=node; //El nodo nuevo ahora es el front
        }
     size++;
    }
    //Inserta un elemento al final
    public void enqueueRear(T d){
       if(isEmpty()){ //Checa si está vacía
        enqueueFront(d);  //Si está vacía se llma a enqueuefront
        }else{
        NodeDL node = new NodeDL(d);  //Si no estña vacía
        rear.next = node;  //El rear next apunta al ndo
        node.back = rear;//El nodo back apunta al rear
        rear = node; //El nuevo es el rear ahora
        size++;//Se incrementa es el size
        }
    }
     //Elimina un elemento  al inicio y devuelve su valor
    public T dequeueFront(){
      if(!isEmpty()){ //Checa si está vacía
        NodeDL fd = front; //Si no se crea un nodo temporarl
        if(size ==1){ //Checa ahora si existe un solo elemento
          clearDeque(); //Entonces se borra el Dequeue con la función
            }else{ //Si no està vacía
            front = front.next;   //Front se elimina
            front.back = null;  //y  el nuevo front en back apunta null
            size--; //Se decrementa el size
            }
            return (T) fd.data;  //Se regresa el dato
              }else{
             return null; //Si está vacia se regresa null
        }
    }
    //Elimina un elemento al final y devuelve su valor
    public T dequeueRear(){
      if(!isEmpty()){  //Checa que no este vacìa
         NodeDL rd = rear;  //Se crea un nodo temporal
         if(size == 1){ //Checa si  hay un solo elemento
            clearDeque();  //Si hay un solo elemento se elimina la el Dequeue
            }else{ //Si hay más de un solo elemento
            rd = rear; //se guarda el rear
            rear = rear.back; //Se elimina el dato 
            rear.next = null;//Y el rear nuevo apunta a null
            size--; //Se decrementa el size
             }
            return (T) rd.data; //Se regresa el dato
            }else{
            return null; //Si no hay elementos se regresa nul
        }
    }
    //Devuelve el valor del elemento aputnado por front
    public T getFront(){
      return (T) front.data;
    }
    //Devuelve el valor del elemento apuntado por rear
    public T getRear(){
     return (T) rear.data;
    }
     //Devuelve el tamaño del Deque
    public int getSize(){
     return size;
    }
    //Evalua so Deque está vaciá y devuelve booleano
    public boolean isEmpty(){
     return size == 0;  //Si size es 0 regresa true,si no regresa false
    }
    //Elimina todos los elementos del Deque
    public void clearDeque(){
     front = rear = null;  //Front y rear apunta a null
     size =0; //Size se vuelve 0
    }
    //Muestra todos los elementos del Deque
    public void showDeque(){
      NodeDL p = front;  //Se crea un nodo temporal
      while(p!=null){  //Cuando p apunta null sera falso
        p.print(); //Se imprime el nodo
        p = p.next; //Avanaza mostrando los nodos
        }
    }
    
}   

