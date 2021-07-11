/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
import java.lang.*;
  
class GFG {
  
    // Function to insert string
    public static String insertString(
        String asliString,
        String stringYangAkanDimasukan,
        int index)
    {
  
        // Create a new string
        String newString = new String();
  
        for (int i = 0; i < asliString.length(); i++) {
  
            // Insert the original string character
            // into the new string
            newString += asliString.charAt(i);
  
            if (i == index) {
  
                // Insert the string to be inserted
                // into the new string
                newString += stringYangAkanDimasukan;
            }
        }
  
        // return the modified String
        return newString;
    }
  
    // Driver code
    public static void main(String[] args)
    {
  
        // Get the Strings
        String asliString = "saya sedang belajar struktur data ";
        String stringYangAkanDimasukan = " pergi ";
        int index = 10;
  
        System.out.println("String asli: "
                           + asliString);
        System.out.println("String yang akan dimasukkan: "
                           + stringYangAkanDimasukan);
        System.out.println("String yang akan disisipkan pada indeks: "
                           + index);
  
        // Insert the String
        System.out.println("String yang Dimodifikasi: "
                           + insertString(asliString,
                                          stringYangAkanDimasukan,
                                          index));
    }
}