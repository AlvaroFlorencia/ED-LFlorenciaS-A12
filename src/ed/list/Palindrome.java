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
public class Palindrome {
     
    Palindrome(String phrase){
    String text2="";  //Variable que guardara  el segunto texto para comparar
    String text=phrase;   ///
    Stack<Character> stack=new Stack<Character>();  //Se crea la pila
    text = text.replaceAll(" ", "");     ///Le quitamos al texto los espacios en blancos
    for(Character d:text.toCharArray()){  //Se corre el for mejorado, convirtiendo a character, y se va insertando en la pila
        stack.push(d);
    }
    while(stack.isEmpty()!=true){  //Mientras este llena la pila, se iran quitando datos de la cima,devolviendo(con pop)
         text2=text2+stack.pop();                           //y guardando en en texto 2   
    }
    if(text.equals(text2)){  //Si texto es igual texto 2(equals es para string)
            System.out.println("The phrase "+phrase+" it is a palindrome");//Si son iguales, son palíndromos        
    }else{
            System.out.println("The phrase "+phrase+" it is not a palindrome");//Si no son iguales,no son palíndromos 
}
   } 
}
