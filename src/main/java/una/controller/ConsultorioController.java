/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.controller;

import com.mycompany.agendadoctor.Constants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import una.service.ConsultorioService;
import una.service.ConsultorioServiceImple;

/**
 *
 * @author Josue
 */
public class ConsultorioController implements ActionListener, KeyListener {

    private JTextField nombreTextField;
    private JTextField fechaTextField;
    private JTextField telefonoTextField;
    private DefaultTableModel tableModel;
    private Object[][] consultorios;
    private ConsultorioService consultorioService;

    public ConsultorioController() {

    }

    public ConsultorioController(JTextField nombreTextField,  DefaultTableModel tableModel) {
        super();

        this.nombreTextField = nombreTextField;
        this.fechaTextField = fechaTextField;
        this.telefonoTextField = telefonoTextField;
        this.tableModel = tableModel;
        
        
        consultorioService = new ConsultorioServiceImple();
        consultorios = consultorioService.loadStudentsObjWrapper();
        //         Load the table with the list of students
        tableModel.setDataVector(consultorios, Constants.TABLE_HEADER);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
