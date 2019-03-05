//Escreva um programa que lê vários números inteiros 
//e finaliza quando for digitado 0 ‘zero’.Use o comando do-while.

package ldp7DoWhile;

import javax.swing.JOptionPane;

public class exercício2 {
    public static void main(String[] args) { 
        int i ;
          i=1;
          while ( i !=0){
            i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
          }
    }   
}
