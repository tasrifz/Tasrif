/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jab05;

import java.util.*;

/**
 *
 * @author Tasrif Zaman
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person(101,"Tasrif",20000.00 );
        Person p2 = new Person(102,"Mahadi",23000.00 );
        Person p3 = new Person(103,"Zayed",22000.00 );
        Person p4 = new Person(104,"Raisul",25000.00 );
        Person p5 = new Person(105,"Abdullah",22000.00 );
        
        
        List l = (List) new ArrayList();
        l.add(p1);
        l.add(p2);
        l.add(p3);
        l.add(p4);
        l.add(p5);
        for (Object l1 : l) {
            System.out.println(l1);
        }
        
        
    }
}
