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
public class NodeBox <E extends Comparable>{
    
    Node bigNode;
    Node smallNode;
    
    public void add(E data)
    {
        Node<E> newNode = new Node<>(data);
        if(bigNode == null)
        {
            bigNode = newNode;
            smallNode = bigNode;
        }
        else
        {
//            if(bigNode.compareTo(newNode)>0)
//            if(bigNode.compareTo(newNode.data)>0)
            if(bigNode.compareTo(newNode)>0)
            {
                smallNode = newNode;
            }
            else
            {
                bigNode = newNode;
            }
        }
    }
    
    public String toString()
    {
        return "Big node: " + bigNode.data + " Small node: " + smallNode.data;
    }
}
