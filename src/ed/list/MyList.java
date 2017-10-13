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
public class MyList<T> {
    Node first;
    Node last;
    Node pointer; //Variables
    //Constructor
    MyList(){
        first=null;
        last=null;  //Constructor without parameters
        pointer=null;
        
    }
    MyList(T data){ //Constructor with parameter 
        Node node =new Node(data);
        first=node; //Pointing node 
        
        last=node;
        node.next=null;
    
    }
    public boolean isEmpty(){
      /*  if(first==null){ // if(first==null && last==null) not necessary
            return true;
        }else{
            return false;
        }
    }*/
      return first==null;
    }
   //Methods  //Is it Empty?
    //Insert the first
    public void insertFirst(T d){
        Node node=new Node(d);
        if(isEmpty()){
            
            //Case empty list
            first=node; //Pointing node 
        
        last=node;
        node.next=null;
            
        }
        else{
           node.next=first; //Case with element
           first=node;
            
        }
        
    }
    //Insert the final
    public void insertLast(T d){
        Node node= new Node(d);
        if(isEmpty()){
            
            //Case empty list
            first=node; //Pointing node 
        
        last=node;
        node.next=null;
            
        }
        else{
           last.next=node; //Case with element
           last=node;
          
            
        }
    }
    //Delete the first
    public void deleteFirst(){
        if(!isEmpty()){
            if(first.next==null){ //Si la lista solo tiene un elemento
                first=null;
                last=null;
            }else{
                first=first.next;
                
            }
        }
    }
      //Delete the final
    public void deleteLast(){
        if(!isEmpty()){
            if(first==last){ //If the list have only a one element  if(first.next==null){ 
                first=last=null;
            }else{//We search in the array
                pointer=first;
               
                while(pointer.next!=last){ // Scrolls the list and stops at the value of  element of the last one
                pointer=pointer.next;
                
            }
                last=pointer;
                last.next=null;
                pointer=null;
                
             
            }
        }
    }
    
    
    //Eliminar nodo
    public boolean deleteNoDe(T n){
       Node p=fetchBack(n);
       if(p!=null){ //If not search the item
        if(p.data==n){  //If was the first or the unic item in the list
       deleteFirst();
       }else{ //If is in the list
       p.next=p.next.next;            
}
       return true;
       }
    return false;
    
    }
    public Node fetch(T n){
        if(!isEmpty()){ //If not is empty
   
                if(first.data==n){    //If the firs data is the item that i searched             
                return first; //Return the first
            }else{
                    Node point = fetchBack(n); //New node p to search the back item
                                        if(point.data!=n){ ///If the data is different to n, return the next
                        return point.next;
                    }
                }
    
    }
            return null;
    }
    public Node fetchBack(T n){
  
        pointer=first;
        if(!isEmpty()){
            if(first==last){ //If has one element
                if(first.data==n){//Is the item I am looking for?
                    return first;//Returns itself
                }else
                { return null;} //If not return null
            }else{
          if(first.data==n){ //If the element is the first
              return first;
          }else{  //If not pointers will be first
              pointer=first;
          
                while(pointer.next!=null){ //while does not reach the end
                          if(pointer.next.data==n){   //if the pointer is the item searched ,return pointer
                             
                              return pointer; 
                          }
                          pointer=pointer.next; //Advance the pointer
                      } 
            }}}
            return null;
           
        }
    }
