/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Membalikkata
{
   public void reverseWordInMyString(String str)
   {
       String[] words = str.split(" ");
	String reversedString = (" ");
	for (int i = 0; i < words.length; i++)
        {
           String word = words[i]; 
           String reverseWord = " ";
           for (int j = word.length()-1; j >= 0; j--) 
	   {
		
		reverseWord = reverseWord + word.charAt(j);
	   }
	   reversedString = reverseWord + reversedString + " ";
	}
	System.out.println(str);
	System.out.println(reversedString);
   }
   public static void main(String[] args) 
   {
	Membalikkata obj = new Membalikkata();
	obj.reverseWordInMyString("selamat datang didunia pemrograman");
	obj.reverseWordInMyString(" salman alfariji ");
   }
}
   