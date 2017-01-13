/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import una.controller.PacienteController;

/**
 *
 * @author Jason
 */
public class PacienteView extends JFrame {

    AgregarPacienteView agregarView = new AgregarPacienteView();
    JTextField searchTermTextField = new JTextField(30);
    JButton buscarButton = new JButton("Buscar");
    JButton agregarButton = new JButton("Agregar");
    JButton eliminarButton = new JButton("Eliminar");
    //Controller
    PacienteController controller;

    JLabel nombreLabel = new JLabel("Nombre:");
    JTable table = new JTable() {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isCellEditable(int row, int colw) {
            return false;
        }
    };
    DefaultTableModel tableModel = new DefaultTableModel();

    public PacienteView() {

        super("Pacientes");
        searchTermTextField.setName("textBusqueda");
        buscarButton.setName("buscarButton");
        agregarButton.setName("agregarButton");
        eliminarButton.setName("eliminarButton");

        nombreLabel.setName("nombreLabel");

        // Create table model
        table.setName("mainTable");
        table.setModel(tableModel);

        // Set the view layout
        JPanel ctrlPane = new JPanel();
        JPanel ctrlPane2 = new JPanel();
        JPanel ctrlPane3 = new JPanel();

        buscarButton.setBackground(Color.WHITE);
        agregarButton.setBackground(Color.GREEN);
        eliminarButton.setBackground(Color.RED);

        ctrlPane.setName("ctrlPanel");
        ctrlPane.add(nombreLabel);
        ctrlPane.add(searchTermTextField);
        ctrlPane.add(buscarButton);
        ctrlPane.add(agregarButton);
        ctrlPane.add(eliminarButton);

        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setName("scrollTable");
        tableScrollPane.setPreferredSize(new Dimension(800, 182));
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Lista de Pacientes",
                TitledBorder.CENTER, TitledBorder.TOP));

        ctrlPane3.setLayout(new BoxLayout(ctrlPane3, BoxLayout.Y_AXIS));
        ctrlPane3.add(ctrlPane);
        ctrlPane3.add(tableScrollPane);
        ctrlPane3.add(ctrlPane2);

        add(ctrlPane3);
        pack();

        this.setMinimumSize(new Dimension(700, 300));
        setLocationRelativeTo(null);

        controller = new PacienteController(searchTermTextField, tableModel, table, agregarView);

        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                agregarView.setVisible(true);
                agregarView.setTitle("Agregar Paciente");
            }
        });

        table.addMouseListener(controller.editAccion);

    }

}
