//Ler um número inteiro n. Escrever a soma de todos os números de 1 até n.Use o comando while.
package ldp7DoWhile;

import javax.swing.JOptionPane;

public class exercício3 {
    public static void main(String[] args) { 
        int i = 1 ;
        int n = 0;
          while (n<0){
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número:"));
            i++;
            int soma= n+1;
          }
    }      
}
