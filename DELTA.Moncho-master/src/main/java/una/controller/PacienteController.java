/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.controller;

import com.mycompany.agendadoctor.Constants;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import una.model.Pacientes;
import una.service.PacienteService;
import una.service.PacientesServiceImple;
import una.view.AgregarPacienteView;

/**
 *
 * @author Josue
 */
public class PacienteController {
    
    private DefaultTableModel tableModel;
    private Object[][] pacientes;
    private PacienteService pacientesService;
    private JTable table;
    AgregarPacienteView agregarView;

    public PacienteController() {
        
    }
    
    public PacienteController(JTextField nombreTextField, DefaultTableModel tableModel, JTable table, AgregarPacienteView agregarView) {
        
        super();
        
        this.tableModel = tableModel;
        this.table = table;
        this.agregarView = agregarView;
        
        pacientesService = new PacientesServiceImple();
        pacientes = pacientesService.loadStudentsObjWrapper();
        //         Load the table with the list of students
        tableModel.setDataVector(pacientes, Constants.T_OBJECTS);
        
    }
    
    public MouseListener editAccion = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent me) {

            // public static final Object[] T_OBJECTS = {"ID", "Nombre ", "Telefono" , "Direccion",  "Enfermedad", "Obcervacion"};
            if (me.getClickCount() == 2) {
                int row = table.getSelectedRow();
                int id = (int) Integer.parseInt(tableModel.getValueAt(row, 0).toString());
                String Nombre = tableModel.getValueAt(row, 1).toString();
                int telefono = (int) Integer.parseInt(tableModel.getValueAt(row, 2).toString());
                String direccion = tableModel.getValueAt(row, 3).toString();
                String enfermedad = tableModel.getValueAt(row, 4).toString();
                String observacion = tableModel.getValueAt(row, 5).toString();
                
                Pacientes paci = new Pacientes(id, Nombre, telefono, direccion, enfermedad, observacion);
                agregarView.editar(paci);
                
            }
        }
        
        @Override
        public void mousePressed(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void mouseReleased(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void mouseEntered(MouseEvent me) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        @Override
        public void mouseExited(MouseEvent me) {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
}
