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
public class AgregarCitasView extends JFrame
{

    JTextField nombre = new JTextField(15);
    JTextField consultorio = new JTextField(15);
    JTextField horaconsulta = new JTextField(15);
    JLabel nombreLabel = new JLabel("Nombre: ");
    JLabel consultorioLabel = new JLabel("Consultorio: ");
    JLabel horaconsultaLabel = new JLabel("Hora de la consulta: ");
    JButton aceptar = new JButton("Guardar");
    JButton cancelar = new JButton("Cancelar");

    public AgregarCitasView()
    {
        super("Agregar Citas");

        nombre.setName("nombretext");
        consultorio.setName("consultoriotext");
        horaconsulta.setName("direcciontext");
        aceptar.setName("aceptarButton");
        cancelar.setName("cancelarButton");

        JPanel stringPane = new JPanel();
        stringPane.setLayout(new BoxLayout(stringPane, BoxLayout.Y_AXIS));
        stringPane.add(nombreLabel);
        stringPane.add(nombre);
        stringPane.add(consultorioLabel);
        stringPane.add(consultorio);
        stringPane.add(horaconsultaLabel);
        stringPane.add(horaconsulta);

        JPanel buttonPane = new JPanel();
        buttonPane.add(aceptar);
        buttonPane.add(cancelar);

        JPanel controlPane = new JPanel();
        controlPane.add(stringPane);
        controlPane.add(buttonPane);

        controlPane.setLayout(new BoxLayout(controlPane, BoxLayout.Y_AXIS));
        stringPane.setOpaque(true);
        setContentPane(controlPane);

        pack();
        setLocationRelativeTo(null);
        this.setMinimumSize(new Dimension(300, 300));

      

// controller
    }
}
