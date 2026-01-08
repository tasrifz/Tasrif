/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan08.io;

import java.io.File;

/**
 *
 * @author Tasrif Zaman
 */
public class DeleteFileExample {
    public static void main(String[] args) {
         try {
            File newfile = new File("D://Lava.text");
             if (newfile.delete()) {
                 System.out.println(newfile.getName()+ " Delete Successfull");
             } else {
                 System.out.println("Delete Successfull");

             }
        } catch (Exception e) {
        }

    }
}
