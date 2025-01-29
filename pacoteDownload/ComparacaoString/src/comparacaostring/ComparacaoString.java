/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacaostring;

/**
 *
 * @author alxdr
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Alxd";
        String nome2 = "Alxd";
        String nome3 = new String("Alxd");
        String res;
        
        res = (nome1==nome2) ? "igual" : "diferente";
        System.out.println(res);
        
    }
    
}
