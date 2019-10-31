/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw04
 */
public class ej9 {
      
    
public static void main(String[] args){
    
String name="...";
 String factura="  ";
        int can=0;
        int preciou=0;
        int iva=0;
        int total;
        int cont=0;
         String lista;
         int totaliva;
         int ivo;
         String ivas;
      String continuar="...";
   try{
        
        name = JOptionPane.showInputDialog("introduce tu nombre");
   }catch(NullPointerException a){JOptionPane.showMessageDialog(null,"cerrar"+a.getMessage());}
   catch(Exception e) {JOptionPane.showMessageDialog(null,"generico");}
  
   
      

      while(!continuar.equals("no"))
      {
          can=0+can;
          preciou=0+preciou;
        can = Integer.parseInt( JOptionPane.showInputDialog("introduce la cantidad del producto"));
        try{
            iva = Integer.parseInt( JOptionPane.showInputDialog("\n-4%"+"\n-10"+"\n21%"));
            if(iva!=4 && iva!=10 && iva!=21){throw new formatoMal();}
        }catch(formatoMal f){JOptionPane.showMessageDialog(null,"generico");}
        catch(Exception e){JOptionPane.showMessageDialog(null,"generico");}
        
        preciou = Integer.parseInt( JOptionPane.showInputDialog("introduce precio unitario de cada producto"));
        
        total= can*preciou;
       lista= "\n LINEA DE DETALLES"+"\n"+can+"" +"x"+preciou +"="+total;
       
       totaliva = 100/total * iva;
       ivo=0+iva;
       int preciof=total+totaliva;
       int  siniv=total-totaliva;
      
       
       ivas ="\n TOTAL SIN IVA"+siniv+"\n"+iva+"de"+total+"="+totaliva+ivo+"\n-TOTAL CON  IVA"+" "+preciof;
        
                                                           
      
      factura= lista+""+ivas ;
    
      
      continuar = JOptionPane.showInputDialog("¿Quieres continuar?");
      
      }
      
       resultado(name,factura);
      

          
        
        
        
        }

static void resultado(String name,String factura){

JOptionPane.showMessageDialog(null,"\n Nombre:" + name +""+ factura);


}


        
    
    
}
    
    
    
    

