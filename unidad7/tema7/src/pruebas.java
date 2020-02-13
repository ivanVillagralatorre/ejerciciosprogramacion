
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1gdaw04
 */
public class pruebas {

    public static void main(String[] args) {

        ArrayList<String> n = new ArrayList();

        n.add("pepe");
        n.add("manolo");

        for (int x = 0; x < n.size(); x++) {
            System.out.println(n.get(x));
        }

      

        n.stream().forEach(System.out::println);
        
       JOptionPane.showConfirmDialog(null,n.stream().count());
       


    }
    
    

}
