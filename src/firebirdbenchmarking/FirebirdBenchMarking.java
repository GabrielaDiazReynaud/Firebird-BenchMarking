/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firebirdbenchmarking;

import java.util.Random;

/**
 *
 * @author Gabriela Diaz R
 */
public class FirebirdBenchMarking {

    /**
     * @param args the command line arguments
     */
   public static Frame frame;
       public static Conexion conexion;
  
    public static void main(String[] args){
      frame= new Frame();
      frame = new Frame();
      frame.setVisible(true);
      frame.setResizable(false);
      conexion=new Conexion();
      MenuPrincipal principal= new MenuPrincipal();
      frame.setPanel(principal);
         
    
    }
    
}
