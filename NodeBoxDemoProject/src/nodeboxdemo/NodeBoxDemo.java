/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeboxdemo;

/**
 *
 * @author Ethan Flynn
 */
public class NodeBoxDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NodeBox<String> stringBox = new NodeBox<>();
        stringBox.add("aaa");
        stringBox.add("bbb");
        System.out.println(stringBox);
        
        NodeBox<Integer> integerBox = new NodeBox<>();
        integerBox.add(3);
        integerBox.add(5);
        System.out.println(integerBox);        
    }
    
}
