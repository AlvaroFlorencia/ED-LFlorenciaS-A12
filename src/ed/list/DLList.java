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
public class DLList<T> {
    NodeDL first;
NodeDL last;
NodeDL  pointer;
int length;
DLList(){
first= null;
last=null;
pointer=null;
length=0;

}
DLList(T d){ //Constructor con un primer nodo
NodeDL node = new NodeDL(d);
//Apuntamos primero y último el nuevo nodo
first=node;
last=node;

//Incrementamos el contador de los elementos de la lista
length++;
}
//Métodos
//Está vacía?
public boolean isEmpty(){
return length==0;
}
//Insertar al inicio
//Escenarios:Lista vacía,Lista con elementos.
public void insertFirst(T d){
NodeDL node=new NodeDL(d);//Si la lista está vacía
if(isEmpty()){
first=node;
last=node;


}else{//Si la lista ya cuenta con elementos
//El siguiente dfel nuevo nodo apunta a donde apunta first
node.next=first;//Node es un objeto por eos el astedisco
//EL nodo que apunta first en su apuntadr back apuna al nuevo nodo
first.back=node; //first es un apuntador por eso la flecha
//El apuntador first apunta al nuevo nodo
first=node;

}
length++;
}
void insertLast(T d){
//Instanciamos el nuevo nodo
NodeDL node =new NodeDL(d);
if(isEmpty()){   //Si està vacia se añade como inicio y final
first=node;
last=node;

}else{
node.back=last; //Si no està vacia se agrega al final
last.next=node;
last=node;
}
length++;
}
void deleteFirst(){   
    
    if(isEmpty()){
        System.out.println("The list is empty"); //Se checa si està vacìa 
    }else{
        if(first.next==null){ //Si se tiene un solo elemento
        first=null;
        last=null;
        }
        else{
            first=first.next; //Si se tienen distintos elementos
            first.back=null;
        }
        length--;
    }
    
}
 
void deleteLast(){
    if(isEmpty()){
        System.out.println("The list is empty"); //Se checa que la lita este vacìa
    }else{
        if(first.next==null){  //Si solo es un elemento
        first=null;
        last=null;
        }else{ //Si se tiene distintos elementos
            pointer=first;
            while(pointer.next!=last){  //Se recoroe  la lista hasta que llegue uno antes del final
                pointer=pointer.next;
            }
            last=pointer;
            last.next=null;
            pointer=null;
        }
        length--;
    }
    
}
void DeleteNode(T d){
     pointer=first;
        NodeDL node= new NodeDL(d);
    if(isEmpty()){ //Se checa que esta vacìa
        System.out.println("The list is empty");
    }else{
        if(first==last){ //Si hay un solo elemento
            if(first.data==d){ //
                deleteFirst();
            }
        }else{ //
           
                if(first.data==d){//Se vuelve a anzalizar los demàs datos
                    deleteFirst();
                }else{
                    pointer=first; //Puntero se vuelve first
                    NodeDL node2=first.next.next; //Se crea un segundo nodo
                    while(pointer.next!=null){ //miestras no se llegue al final
                        if(pointer.next.data==node){ //Si los dato siguiente igual nodo
                            pointer.next=pointer.next.next;  //Se mueven los punteros 
                            node2=node2.back.back;
                        }
                        pointer=pointer.next; 
                        node2=node2.next;
                    }
                    
                }
            }
        }
        
    }


void ShowListStartEnd(){
    pointer=first;
    System.out.println(first+"->");
    for(int i= 0; i<length;i++){  //Se corrre el arreglo de izquierda a derecha y se muestra el contenido
        System.out.println("["+pointer.data.toString() + "]->");
        pointer=pointer.next;
    }
    System.out.println("<-"+last);
    
}
void ShowListEndStart(){
    pointer=last;
    System.out.println(last+"->"); //Se corre el arreglo de derecha  a izquierda y se muestra el contenido
    for(int i= 0; i<length;i--){
        System.out.println("["+pointer.data.toString()+"]->");
        pointer=pointer.back;
    }
    System.out.println("<-"+first);
    
}


}

