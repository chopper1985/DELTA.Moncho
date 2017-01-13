/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import una.model.Pacientes;

/**
 *
 * @author Jason
 */
public class AgregarPacienteView extends JFrame {

    JTextField id = new JTextField(15);
    JTextField nombre = new JTextField(15);
    JTextField telefono = new JTextField(15);
    JTextField direccion = new JTextField(15);
    JTextField fechaNaci = new JTextField(15);
    JTextField enfermedades = new JTextField(15);
    JTextArea observaciones = new JTextArea(4, 26);
    JLabel idLabel = new JLabel("Identificacion: ");
    JLabel nombreLabel = new JLabel("Nombre: ");
    JLabel telefLabel = new JLabel("Telefono: ");
    JLabel dirLabel = new JLabel("Direccion: ");
    JLabel fechaLabel = new JLabel("Fecha Nacimiento: ");
    JLabel EnfermLabel = new JLabel("Enfermedades: ");
    JLabel ObvsLabel = new JLabel("Observaciones: ");
    JButton aceptar = new JButton("Guardar");
    JButton cancelar = new JButton("Cancelar");

    public AgregarPacienteView() {
        super("Agregar Paciente");
        id.setName("idtext");
        id.setEnabled(false);
        nombre.setName("nombretext");
        telefono.setName("telefonotext");
        direccion.setName("direcciontext");
        fechaNaci.setName("fechatext");
        enfermedades.setName("enfermedadestext");
        aceptar.setName("aceptarButton");
        cancelar.setName("cancelarButton");

        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                id.setText("");
                nombre.setText("");
                telefono.setText("");
                direccion.setText("");
                fechaNaci.setText("");
                enfermedades.setText("");
                observaciones.setText("");
            }
        });

        JPanel stringPane = new JPanel();
        stringPane.setName("stringPane");
        stringPane.setLayout(null);
        stringPane.setBounds(20, 20, 500, 480);

        //stringPane.setLayout(new BoxLayout(stringPane, BoxLayout.Y_AXIS));
        idLabel.setBounds(20, 20, 200, 20);
        stringPane.add(idLabel);
        id.setBounds(135, 20, 200, 20);
        stringPane.add(id);

        nombreLabel.setBounds(20, 60, 200, 20);
        stringPane.add(nombreLabel);
        nombre.setBounds(135, 60, 200, 20);
        stringPane.add(nombre);

        telefLabel.setBounds(20, 100, 200, 20);
        stringPane.add(telefLabel);
        telefono.setBounds(135, 100, 200, 20);
        stringPane.add(telefono);

        dirLabel.setBounds(20, 140, 200, 20);
        stringPane.add(dirLabel);
        direccion.setBounds(135, 140, 200, 20);
        stringPane.add(direccion);

        fechaLabel.setBounds(20, 180, 200, 20);
        stringPane.add(fechaLabel);
        fechaNaci.setBounds(135, 180, 200, 20);
        stringPane.add(fechaNaci);

        EnfermLabel.setBounds(20, 220, 200, 20);
        stringPane.add(EnfermLabel);
        enfermedades.setBounds(135, 220, 200, 20);
        stringPane.add(enfermedades);

        ObvsLabel.setBounds(20, 260, 200, 20);
        stringPane.add(ObvsLabel);
        observaciones.setBounds(135, 260, 200, 20);
        stringPane.add(observaciones);

        //JPanel buttonPane = new JPanel();
        aceptar.setBounds(100, 300, 100, 20);
        stringPane.add(aceptar);
        cancelar.setBounds(220, 300, 100, 20);
        stringPane.add(cancelar);

        JPanel controlPane = new JPanel();
        controlPane.add(stringPane);
        // controlPane.add(buttonPane);

        controlPane.setLayout(new BoxLayout(controlPane, BoxLayout.Y_AXIS));
        stringPane.setOpaque(true);
        setContentPane(controlPane);

        pack();
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(500, 480));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

// controller
    }

    public void editar(Pacientes paciente) {
        id.setText(String.valueOf(paciente.getId()));
        nombre.setText(paciente.getNombre());
        telefono.setText(String.valueOf(paciente.getTelefono()));
        direccion.setText(paciente.getDireccion());
        fechaNaci.setText(paciente.getEnfermedades());
        enfermedades.setText(paciente.getEnfermedades());
        observaciones.setText(paciente.getObservacion());
        this.setVisible(true);
        this.setTitle("Editando Paciente");
    }
}
