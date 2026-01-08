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
public class RenameFileExample {
    public static void main(String[] args) {
        File oldfile = new File("D:\\Java.text");
        File newfile = new File("D:\\Lava.text");
        if (oldfile.renameTo(newfile)) {
            System.out.println("Rename Succesfull");
        } else {
            System.out.println("Rename Succesfull");

        }
    }
}
