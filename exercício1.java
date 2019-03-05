//Imprimir os números inteiros entre 1 e 10 utilizando o comando do-while.
package ldp7DoWhile;

import javax.swing.JOptionPane;

public class exercício1 {
    public static void main(String[] args) {
        int i=1;
        String dado;
        do{
            JOptionPane.showMessageDialog(null, i);
            i++;
        }while(i <= 10);
            }
}
