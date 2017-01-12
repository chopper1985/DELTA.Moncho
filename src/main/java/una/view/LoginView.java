/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.view;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import una.controller.LoginController;

/**
 *
 * @author Josue
 */
public class LoginView extends JFrame {

    JLabel idLabel = new JLabel("Id");
    JTextField idTextField = new JTextField(26);
    JLabel passwordLabel = new JLabel("Password");
    JTextField passwordTextField = new JTextField(26);

    JButton entrarButton = new JButton("Entrar");
    LoginController controller;

    public LoginView(MenuPrincipalClinicaView menu) {
        super("Login");
        entrarButton.setName("enrarButton");

        idTextField.setName("txtId");
        passwordTextField.setName("txtPass");

        JPanel ctrlPane = new JPanel();
        ctrlPane.setName("ctrlPanel");
        ctrlPane.setLayout(null);
        ctrlPane.setBounds(20, 20, 500, 200);

        //Jlabel para indicar que contiene este espacio
        idLabel.setBounds(20, 20, 200, 20);
        ctrlPane.add(idLabel);
        idTextField.setBounds(200, 20, 200, 20);
        ctrlPane.add(idTextField);

        passwordLabel.setBounds(20, 60, 200, 20);
        ctrlPane.add(passwordLabel);
        passwordTextField.setBounds(200, 60, 200, 20);
        ctrlPane.add(passwordTextField);


        entrarButton.setBounds(300, 140, 100, 20);
        ctrlPane.add(entrarButton);

        controller = new LoginController(idTextField, passwordTextField, menu, this);

        entrarButton.addActionListener(controller.loginAction);
        ctrlPane.setOpaque(true);

        setContentPane(ctrlPane);
        pack();
        this.setMinimumSize(new Dimension(450, 200));
        setLocationRelativeTo(null);
        setVisible(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
