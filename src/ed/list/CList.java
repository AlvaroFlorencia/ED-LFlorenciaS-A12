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
public class CList <T> {
    
    Node pivot;
    Node pointer;//Atributos
    int length; 
    
    CList(){
       pivot=pointer=null;  //Construtor sin recibir parametros,inicialzia todo null ó 0
       length=0;
    }
    CList(T d){
        Node node= new Node(d);  //Vrea un nodo y aument el length
        pivot=node.next=node;
        length++;
    }
    public boolean isEmpty(){   //Regresa true si length es igual a 0
        return length==0;
    }
    public void insert(T d){
        Node node= new Node(d); //Checa si está vacío y hace al nodo el pivote
        
        if(isEmpty()){
            pivot=node.next=node;
        }else{
            node.next=pivot.next;  //De no ser así el siguiente nodo apunta al siguiente pivote
            pivot.next=node; //El siguiente pivote se vuelve el nodo 
        }
        length++;
    }
    public void deleteNode(T d){
        if(!isEmpty()){        //Checa que este vacía ,si no es así
            pointer=pivot;  //EL puntero se vuelve el pivote
            for(int i=1;i<=length;i++){  //Se corfee el arreglo
                if(pointer.next.data==d){    //Si el dato del puntero siguiebte es igual al que buscamos
                    pointer.next=pointer.next.next; //Se eblaza al puntero siguinete y se elimina el nodo
                 if(pivot.data==d) {  //Si existe un elemento en la lista y es el que buscmaos
                     pivot=pointer;  //Pivote se vuelve pointer y se elimina
                 }  
                 length--;
                 pointer=null;  //Si no se disminuye el length,puntero no marca nada y se sale del ciclo aumentano uno en length
                 i=length+1;
                }
            pointer=pointer.next;  //El puntero ahira es el siguiente
            }
            
        }
    }
    
    public void deleteList(){  //Para eliminar la lista completa pivote y pointer se vuelven nulos
        pivot=pointer=null;
    }
    public void showList(){
        if(!isEmpty()){
              pointer=pivot;
    System.out.println("start->");
    for(int i= 0; i<length;i++){  //Se corrre el arreglo 
        System.out.println("["+pointer.data.toString() + "]->"); //Se van mostrando los datos
        pointer=pointer.next; //Se va moviendo el puntero
    }
    System.out.println("<-end");
        }
        else{
            System.out.println("No data in the list"); //Si está vacía no se muestran datos
        }
        pointer=null;
    }
    public void showListbyAddress(){
        if(!isEmpty()){
              pointer=pivot;
    System.out.println("start->");
    for(int i= 1; i<length;i++){  //Se corrre el arreglo 
        System.out.println("["+pointer.toString() + "]->"); //Se va mostrando la información del apuntaor
        pointer=pointer.next; //Se va moviendo el puntero
    }
    System.out.println("<-end");
        }
        else{
            System.out.println("No data in the list"); //Si está vacía no se muestran datos
        }
        pointer=null;
    }
    
}
