/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jason
 */
public class CitasView extends JFrame {

        String[] consultorios
            = {
                "Consultorio: ", "Hospital", "INS"
            };
    String[] pacientes
            = {
                "Pacientes: ", "juan", "Kuko"
            };
    
    JButton buscarButton = new JButton("Buscar");

    JButton agregarButton = new JButton("Agregar");
    JComboBox consultorioBox = new JComboBox();
    JComboBox pacientesBox = new JComboBox();
    JTable table = new JTable() {
        private static final long serialVersionUID = 1L;

        @Override
        public boolean isCellEditable(int row, int colw) {
            return false;
        }
    };
    DefaultTableModel tableModel = new DefaultTableModel();

    public CitasView() {
        super("Citas");
        buscarButton.setName("buscarcitaButton");

        consultorioBox.setName("boxconsultorio");
        pacientesBox.setName("boxPaciente");
        agregarButton.setName("agregarButton");

        table.setName("mainTable");
        table.setModel(tableModel);

        for (String consultorio : consultorios) {
            consultorioBox.addItem(consultorio);
        }

          for (String paciente : pacientes) {
            pacientesBox.addItem(paciente);
        }

        JPanel ctrlPane = new JPanel();
        JPanel ctrlPane2 = new JPanel();
        JPanel ctrlPane3 = new JPanel();

        buscarButton.setBackground(Color.WHITE);
        agregarButton.setBackground(Color.GREEN);

        ctrlPane.setName("ctrlPanel");
        ctrlPane.add(pacientesBox);
        ctrlPane.add(consultorioBox);
       
        ctrlPane.add(buscarButton);

        ctrlPane.add(agregarButton);

        JScrollPane tableScrollPane = new JScrollPane(table);
        tableScrollPane.setName("scrollTablePaneCitas");
        tableScrollPane.setPreferredSize(new Dimension(700, 182));
        tableScrollPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Lista de Citas",
                TitledBorder.CENTER, TitledBorder.TOP));

        ctrlPane3.setLayout(new BoxLayout(ctrlPane3, BoxLayout.Y_AXIS));
        ctrlPane3.add(ctrlPane);
        ctrlPane3.add(tableScrollPane);
        ctrlPane3.add(ctrlPane2);

        add(ctrlPane3);
        pack();

        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(700, 300));

        //Controller
    }
}
