/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Jason
 */
public class MenuPrincipalClinicaView extends JFrame {

    ConsultorioView consultorioView;
    PacienteView pacienteView;
    CitasView citaView;

    public MenuPrincipalClinicaView(ConsultorioView consultorioView, PacienteView pacienteView, CitasView citaView) {
        super("Menu Principal de la Agenda");

        this.consultorioView = consultorioView;
        this.pacienteView = pacienteView;
        this.citaView = citaView;
        initUI();

        //Controller
    }

    private void initUI() {
        createMenuBar();
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();

        //file menu
        JMenu fileMenu = new JMenu("File");

        //ImageIcon icon = new ImageIcon("exit.png");

        JMenuItem eMenuItem = new JMenuItem("Exit"/*, icon*/);
        eMenuItem.setToolTipText("Exit application");
        
        
        eMenuItem.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        fileMenu.add(eMenuItem);

        //paciente menu
        JMenuItem menViewPaciente = new JMenuItem("Paciente");
        menViewPaciente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                pacienteView.setVisible(true);
            }
        });
        
        
        
        
        JMenuItem viewConsultorio = new JMenuItem("Consultorio");
        viewConsultorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                consultorioView.setVisible(true);
            }
        });
        
        JMenuItem viewCita = new JMenuItem("Citas");
        viewCita.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                citaView.setVisible(true);
            }
        });
        
        JMenuItem helpMenu = new JMenuItem("Help");

        menubar.add(fileMenu);
        menubar.add(menViewPaciente);
        menubar.add(viewConsultorio);
        menubar.add(viewCita);
        menubar.add(Box.createHorizontalGlue());
        menubar.add(helpMenu);

        setJMenuBar(menubar);
    }

}
