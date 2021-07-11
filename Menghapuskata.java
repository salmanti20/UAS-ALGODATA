/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
package com.tcc.java.programs;
 
import java.util.Scanner;

public class Menghapuskata {
    public static void main(String args[]) {
        String sentence, word;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Masukan kalimat");
        sentence = scanner.nextLine();
 
        System.out.println("Masukkan kata yang ingin Anda hapus dari Kalimat");
        word = scanner.nextLine();
        // Deleting word from
        sentence = sentence.replaceAll(word, "");
 
        System.out.println("Output kalimat\n" + sentence);
    }
}