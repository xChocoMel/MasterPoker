/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masterpoker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class SigninController implements Initializable
{
    @FXML TextField tfUsername;
    @FXML TextField tfPassword;
    @FXML TextField tfEmail;
    
    private MasterPoker main;
    
    public void setApp(MasterPoker application)
    {
        this.main = application;
    }
    /**
     * Initializes the controller class.
     */        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void register()
    {
        if(!tfUsername.getText().equals("") && !tfPassword.getText().equals("") && !tfEmail.getText().equals(""))
        {
            //pop up scherm met feedback naar de gebruiker.
            JOptionPane.showMessageDialog(null,"Succesvol aangemeld");
            
            //terug naar inlog scherm.
            main.goToLogin();
        }
        else if (tfUsername.getText().equals("Melanie"))
        {
            JOptionPane.showMessageDialog(null,"Dit account bestaat al");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Er is iets fout gegaan, probeer het opnieuw");
            tfUsername.setText("");
            tfPassword.setText("");
            tfEmail.setText("");
        }
    }  
}
