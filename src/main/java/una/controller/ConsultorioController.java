/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josue
 */
public class ConsultorioController implements ActionListener, KeyListener {

    private JTextField nombreTextField;
    private JTextField fechaTextField;
    private JTextField telefonoTextField;
    private DefaultTableModel tableModel;

    public ConsultorioController() {
        
        
    }

    public ConsultorioController(JTextField nombreTextField, JTextField fechaTextField, JTextField telefonoTextField, DefaultTableModel tableModel) {
        super();
        this.nombreTextField = nombreTextField;
        this.fechaTextField = fechaTextField;
        this.telefonoTextField = telefonoTextField;
        this.tableModel = tableModel;
        
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
