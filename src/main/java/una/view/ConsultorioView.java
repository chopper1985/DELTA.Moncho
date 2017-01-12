/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
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

    AgregarConsultorioView agregarView = new AgregarConsultorioView();
    JTextField nombreTextField = new JTextField(26);
//    JTextField fechaTextField = new JTextField(26);
//    JTextField telefonoTextField = new JTextField(26);

    JButton buscarButton = new JButton("Buscarr");
    JButton agregarButton = new JButton("Agregar");
    JButton eliminarButton = new JButton("Eliminar");

    JLabel nombreLabel = new JLabel("Nombre del Consultorio");
//    JLabel fechaLabel = new JLabel("Horario de Atencion");
//    JLabel telefonoLabel = new JLabel("Telefono del Consultorio");

    JTable table = new JTable(){
        private static final long serialVersionUID = 1L;
        @Override
        public boolean isCellEditable(int row, int colw){
            return false;
        }
    };
    DefaultTableModel tableModel = new DefaultTableModel();

    public ConsultorioView() {
        super("Consultorio");
        nombreTextField.setName("txtNombre");
//        fechaTextField.setName("txtFecha");
//        telefonoTextField.setName("txtTelefono");
        buscarButton.setName("btnBuscar");
        agregarButton.setName("btnAgregar");
        eliminarButton.setName("btnEliminar");

        // Create table model
        table.setName("mainTable");
        table.setModel(tableModel);

        ConsultorioController controller = new ConsultorioController(nombreTextField, tableModel);
        agregarButton.addActionListener(controller);

        // Set the view layout
        JPanel ctrlPane = new JPanel();
        ctrlPane.setName("ctrlPanel");
        //ctrlPane.setLayout(null);
        ctrlPane.setBounds(20, 20, 600, 300);

        //Jlabel para indicar que contiene este espacio
        nombreLabel.setBounds(20, 20, 200, 20);
        ctrlPane.add(nombreLabel);
        nombreTextField.setBounds(200, 20, 200, 20);
        ctrlPane.add(nombreTextField);

        buscarButton.setBounds(300, 140, 100, 20);
        ctrlPane.add(buscarButton);
        agregarButton.setBounds(300, 140, 100, 20);
        ctrlPane.add(agregarButton);
        eliminarButton.setBounds(300, 140, 100, 20);
        ctrlPane.add(eliminarButton);

        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setName("scrollTablePaneStudent");
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Informacion",
                TitledBorder.CENTER, TitledBorder.TOP));

        tableScrollPane.setBounds(20, 180, 460, 200);
        ctrlPane.add(tableScrollPane);

  

        ctrlPane.setPreferredSize(new Dimension(800, 500));
        add(ctrlPane);

        pack();

        setLocationRelativeTo(null);
      
        
        
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                agregarView.setVisible(true);
            }
        });
    }

}
