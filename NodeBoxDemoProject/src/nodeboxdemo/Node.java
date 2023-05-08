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
public class Node <E extends Comparable> implements Comparable<Node>{
    E data;

    public Node (E data)
    {
        this.data = data;
    }
      
//    public int compareTo(Object t) {
//        return this.data.compareTo(((Node)t).data);
//    }

//    @Override
//    public int compareTo(E t) {
//        return this.data.compareTo(t);
//    }

    @Override
    public int compareTo(Node t) {
        return this.data.compareTo(t.data);
    }
}
