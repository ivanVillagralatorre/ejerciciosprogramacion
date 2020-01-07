/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class NewClass {
    
    public static void main(String [] args){
        
        
        int c=3;
        
        
        try{ if(c!=1)
        {throw new CampoObligatorio();}
        
        }catch(CampoObligatorio d){ JOptionPane.showMessageDialog(null,"no debe de ser diferente de 1");}
        
    
}
}