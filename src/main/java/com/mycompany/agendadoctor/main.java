/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendadoctor;

import java.io.IOException;
import javax.swing.SwingUtilities;
import una.view.ConsultorioView;

/**
 *
 * @author Josue
 */
public class main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();

                } catch (Exception e) {
                    System.err.println(e);
                }
            }
        });  
        // TODO code application logic here
    }
      public static void createAndShowGUI() throws Exception {
        ConsultorioView View = new ConsultorioView();
    }
    
}
