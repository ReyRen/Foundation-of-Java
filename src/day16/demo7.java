package day16;

import java.util.TreeSet;

/**
 * Created by reyren on 2017/2/28.
 */
/*
* TreeSet:如果元素具备自然顺序的特性，那么就按照元素自然顺序的特性进行排序存储
* */

public class demo7 {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        /*tree.add(1);
        tree.add(10);
        tree.add(19);
        tree.add(7);
        tree.add(9);*/

        tree.add('b');
        tree.add('f');
        tree.add('a');
        tree.add('e');

        System.out.println(tree);
    }
}
