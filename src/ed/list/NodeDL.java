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
public class NodeDL<T> {
    //Template es igual a clase generica en Java
T data;
NodeDL next;//Apuntador a siguiente
NodeDL back;//Apuntador a anterior

NodeDL(T d){ //Constructor
data=d;
next= null;
back= null;

}
void print(){
    System.out.println(data+"<=>");
}
}