/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan08.io;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Tasrif Zaman
 */
public class CtreateFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java.text");
            
            if (file.createNewFile()) {
                System.out.println("File is Creating");
            } else {
                System.out.println("File is not Creating");
            }
        } catch (IOException e) {
            
            //e.fillInStackTrace();
        }
    }
}
