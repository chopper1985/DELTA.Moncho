/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import una.view.LoginView;
import una.view.MenuPrincipalClinicaView;

/**
 *
 * @author Josue
 */
public class LoginController {

    private JTextField idTermTextField;
    private JTextField passwordTermTextField;
    private MenuPrincipalClinicaView menu;
    private LoginView login;

    public LoginController() {
    }

    public LoginController(JTextField idTermTextField, JTextField passwordTermTextField, MenuPrincipalClinicaView menu, LoginView login) {
        this.idTermTextField = idTermTextField;
        this.passwordTermTextField = passwordTermTextField;
        this.menu = menu;
        this.login = login;

    }

    public void login() {
//        if (idTermTextField.getText().equals("admin") && passwordTermTextField.getText().equals("123")) {
            menu.setVisible(true);
            login.setVisible(false);

//        } else {
//            JOptionPane.showMessageDialog(menu, "No coincide el Usuario", "Error", JOptionPane.ERROR_MESSAGE);
//        }

    }

    public ActionListener loginAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            login();
        }
    };
            
            
            


}
