/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jason
 */
public class AgregarConsultorioView extends JFrame {

//    JTextField nombre = new JTextField(20);
//    JTextField fechaAtencion = new JTextField(20);
//    JTextField telefonoContacto = new JTextField(20);
//    JLabel nombreLabel = new JLabel("Nombre: ");
//    JLabel horarioLabel = new JLabel("Horario de Atencion: ");
//    JLabel telefonoLabel = new JLabel("Telefono: ");
//    JButton aceptar = new JButton("Aceptar");
//    JButton cancelar = new JButton("Cancelar");

    JTextField nombreTextField = new JTextField(26);
    JTextField fechaTextField = new JTextField(26);
    JTextField telefonoTextField = new JTextField(26);
    JButton aceptarButton = new JButton("Guardar");
    JLabel nombreLabel = new JLabel("Nombre del Consultorio");
    JLabel fechaLabel = new JLabel("Horario de Atencion");
    JLabel telefonoLabel = new JLabel("Telefono del Consultorio");

    public AgregarConsultorioView() {
  super("Consultorio");
        aceptarButton.setName("aceptarButton");
       
        nombreTextField.setName("txtNombre");
        fechaTextField.setName("txtFecha");
        telefonoTextField.setName("txtTelefono");
        aceptarButton.setName("btnAgregar");
        
        
        JPanel ctrlPane = new JPanel();
        ctrlPane.setName("ctrlPanel");
        ctrlPane.setLayout(null);
        ctrlPane.setBounds(20, 20, 500, 200);

        //Jlabel para indicar que contiene este espacio
        nombreLabel.setBounds(20, 20, 200, 20);
        ctrlPane.add(nombreLabel);
        nombreTextField.setBounds(200, 20, 200, 20);
        ctrlPane.add(nombreTextField);

        fechaLabel.setBounds(20, 60, 200, 20);
        ctrlPane.add(fechaLabel);
        fechaTextField.setBounds(200, 60, 200, 20);
        ctrlPane.add(fechaTextField);

        telefonoLabel.setBounds(20, 100, 160, 20);
        ctrlPane.add(telefonoLabel);
        telefonoTextField.setBounds(200, 100, 200, 20);
        ctrlPane.add(telefonoTextField);

        aceptarButton.setBounds(300, 140, 100, 20);
        ctrlPane.add(aceptarButton);


       
        ctrlPane.setOpaque(true);

        setContentPane(ctrlPane);
        pack();
        this.setMinimumSize(new Dimension(500, 200));
        setLocationRelativeTo(null);
       

        //Controller
    }
}
