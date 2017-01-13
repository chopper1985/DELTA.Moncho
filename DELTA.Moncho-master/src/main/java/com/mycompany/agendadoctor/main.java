/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.agendadoctor;

import javax.swing.SwingUtilities;
import una.view.AgregarCitasView;
import una.view.AgregarConsultorioView;
import una.view.CitasView;
import una.view.ConsultorioView;
import una.view.LoginView;
import una.view.MenuPrincipalClinicaView;
import una.view.PacienteView;

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
        Session session = new Session();
        ConsultorioView consultorioView = new ConsultorioView();
        PacienteView pacienteView = new PacienteView();
        CitasView citaView = new CitasView();

        MenuPrincipalClinicaView menuPrincipalView = new MenuPrincipalClinicaView(consultorioView, pacienteView, citaView);
        LoginView View = new LoginView(menuPrincipalView);
        
        
        
        
        
    }

}
