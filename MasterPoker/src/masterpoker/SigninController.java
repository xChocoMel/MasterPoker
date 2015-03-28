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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    @FXML Label lbUsername;
    @FXML Label lbPassword;
    @FXML Label lbEmail;
    @FXML Button btnSignin;
    
    private MasterPoker main;
    
    public void setApp(MasterPoker application)
    {
        this.main = application;
        
        if (main.getLanguage().equals("dutch"))
        {
            tfPassword.setPromptText("Voer uw wachtwoord in");
            tfUsername.setPromptText("Voer uw gebruikersnaam in");
            tfEmail.setPromptText("Voer uw email in");
            lbPassword.setText("Wachtwoord");
            lbUsername.setText("Gebruikersnaam");
            lbEmail.setText("Email");
            btnSignin.setText("Aanmelden");
        }
        else if (main.getLanguage().equals("english"))
        {
            tfPassword.setPromptText("Add your password");
            tfUsername.setPromptText("Add your username");
            tfEmail.setPromptText("Add your email");
            lbPassword.setText("Password");
            lbUsername.setText("Username");
            lbEmail.setText("Email");
            btnSignin.setText("Sign in");
        }
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
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null,"Succesvol aangemeld");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null,"Signing in succesful");
            }
            
            //terug naar inlog scherm.
            main.goToLogin();
        }
        else if (tfUsername.getText().equals("Melanie") || tfUsername.getText().equals("Jos"))
        {
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null,"Dit account bestaat al");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null,"Account already exists");
            }            
        }
        else
        {
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null,"Er is iets fout gegaan, probeer het opnieuw");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null,"Something went wrong, try it again");
            }   
            
            tfUsername.setText("");
            tfPassword.setText("");
            tfEmail.setText("");
        }
    }  
}
