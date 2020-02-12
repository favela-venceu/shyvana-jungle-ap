/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miss.lexotan;

import javax.swing.JOptionPane;
public class xxx 
{
   public static void main( String[] args )
   {
       String primeironumero = 
               JOptionPane.showInputDialog("bota o primeiro numerokk");
       String segundonumero = 
               JOptionPane.showInputDialog("bota o segundo cornokk");
       
   int number1 = Integer.parseInt(primeironumero);
   int number2 = Integer.parseInt(segundonumero);
   int sum = number1 + number2;
   JOptionPane.showMessageDialog( null, "a soma deu " + sum,
           "soma de dois numeros", JOptionPane.PLAIN_MESSAGE );
   }
}
