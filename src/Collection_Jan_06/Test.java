/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection_Jan_06;

import java.util.*;

/**
 *
 * @author TASRIF ZAMAN
 */
public class Test {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Mr.Tasrif", 28 , new SalaryStructure(15000, 32000, 25000, "AS-COMPANY-POLICY", 2700), new EmployeeAddress("Sadarghat", 41, 10012, "Kotowali", 1110));
         Employee e2 = new Employee(102, "Mr.Mahadi", 26 , new SalaryStructure(17000, 35000, 28000, "NORMAL", 2800), new EmployeeAddress("Mirpur", 44, 1212, "Mirpur-12", 1100));
          Employee e3 = new Employee(103, "Mr.Zayed",26 , new SalaryStructure(18000, 45000, 30000, "YEARLY", 2600),new EmployeeAddress("Badda", 06, 112, "Ramna", 1200));
           Employee e4 = new Employee(104, "Mr.Raisul",28 , new SalaryStructure(25000, 55000, 40000, "NORMAL", 2500),new EmployeeAddress("Rampura", 14, 12312, "Badda", 1210));
            Employee e5 = new Employee(105, "Mr.Sefat", 28, new SalaryStructure(27000, 66000, 45000, "YEARLY", 3000),new EmployeeAddress("Shantinagar", 21,1245, "Malibag",1170 ));
       
            /*---------------List without Generics----------------*/
         List l = new ArrayList();
          l.add(e1);
          l.add(e2);
//          l.add(e3);
//          l.add(e4);
          l.add(e5);
          l.add("Tasrif");
          l.add(100);
//        l.contains(e1)
//        Employee emp = (Employee) l.get(3);
        for (Object o : l) {
            System.out.println(o);
        }
//          for (int i = 0; i < l.size(); i++) {
//              System.out.println(l.get(i));
 //       } 
            
           // System.out.println(":::::::::::::::::::");
            
            /*---------------List with Generics (Type Safe List)----------------*/
            List <Employee> empList = new ArrayList<>();
            empList.add(e1);
            empList.add(e2);
            empList.add(e4);
            empList.add(e5);
  //        empList.add("Tasrif"); // Runtime exception
            for (Employee empList1 : empList) {
            System.out.println(empList1);
      
        }
         
            /*---------------Set with Generics (Type Safe List)----------------*/
          
         System.out.println("::::Set with Generics HashSet:::::");
         
         Set <Employee> hasSet = new HashSet<>();
         hasSet.add(e1);
         hasSet.add(e2);
         hasSet.add(e1); // duplicate
         hasSet.add(e4);
         hasSet.add(e5);
         System.out.println(hasSet.size()); // size count duplicate also
         System.out.println(hasSet.equals(l)); // false
         System.out.println(hasSet.equals(hasSet));// true
         
         for (Employee hasSet1 : hasSet) {
             System.out.println(hasSet1);
        }
         
         System.out.println(":::: Set with Generics LinkedHashSet:::::");
       
        Set <Employee> linkedSet = new LinkedHashSet<>(); 
        linkedSet.add(e1);
        linkedSet.add(e1);
        linkedSet.add(e3);
        linkedSet.add(e4);
        linkedSet.add(e5);
        System.out.println(linkedSet.size()); //3 does't allow duplicate
        System.out.println(linkedSet.equals(l)); // false ref difference
        System.out.println(linkedSet.equals(linkedSet)); // true ref same
        System.out.println(linkedSet.iterator()); // shows java.util.LinkedHashMap$LinkedKeyIterator@5c647e05
     
      System.out.println(":::: Iterator with Generics LinkedHashSet:::::");
         
         Iterator <Employee> it = linkedSet.iterator();
         while (it.hasNext()) {
           //  System.out.println(it.next());
            // System.out.println(it.hasNext());// return 
            
        }
    }
    
}
