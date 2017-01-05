/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import una.controller.ConsultorioController;

/**
 *
 * @author Josue
 */
public class ConsultorioView extends JFrame {

    JTextField nombreTextField = new JTextField(26);
    JTextField fechaTextField = new JTextField(26);
    JTextField telefonoTextField = new JTextField(26);
    JButton aceptarButton = new JButton("Aceptar");
    JLabel nombreLabel = new JLabel("Nombre del Consultorio");
    JLabel fechaLabel = new JLabel("Horario de Atencion");
    JLabel telefonoLabel = new JLabel("Telefono del Consultorio");

    JTable table = new JTable();
    DefaultTableModel tableModel = new DefaultTableModel();

    public ConsultorioView() {
        super("Consultorio");

        nombreTextField.setName("txtNombre");
        fechaTextField.setName("txtFecha");
        telefonoTextField.setName("txtTelefono");
        aceptarButton.setName("btnAceptar");

        // Create table model
        table.setName("mainTable");
        table.setModel(tableModel);

        ConsultorioController controller = new ConsultorioController(nombreTextField, fechaTextField, telefonoTextField, tableModel);
        aceptarButton.addActionListener(controller);

        // Set the view layout
        JPanel ctrlPane = new JPanel(new GridLayout(6, 6));
        ctrlPane.setName("ctrlPanel");

        //Jlabel para indicar que contiene este espacio
        nombreLabel.setBounds(20, 20, 100, 50);
        ctrlPane.add(nombreLabel);
        nombreTextField.setBounds(80, 20, 100, 50);
        ctrlPane.add(nombreTextField);

        fechaLabel.setBounds(20, 90, 100, 50);
        ctrlPane.add(fechaLabel);
        fechaTextField.setBounds(80, 90, 100, 50);
        ctrlPane.add(fechaTextField);

        telefonoLabel.setBounds(20, 60, 160, 50);
        ctrlPane.add(telefonoLabel);
        telefonoTextField.setBounds(80, 160, 50, 50);
        ctrlPane.add(telefonoTextField);
        
        aceptarButton.setBounds(100, 230, 50, 50);
        ctrlPane.add(aceptarButton);

//        JScrollPane tableScrollPane = new JScrollPane(table);
//        tableScrollPane.setName("scrollTablePaneStudent");
//        tableScrollPane.setPreferredSize(new Dimension(700, 182));
//        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Informacion",
//                TitledBorder.CENTER, TitledBorder.TOP));
//       JSplitPane splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, ctrlPane, tableScrollPane);
//        splitPane.setName("splitPane");
//        splitPane.setDividerLocation(35);
//        splitPane.setEnabled(false);
//        //Display it all in a scrolling window and make the window appear
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(ctrlPane);
        pack();
        //this.setSize(600, 800);
        setLocationRelativeTo(null);
        setVisible(true);

    }

}
