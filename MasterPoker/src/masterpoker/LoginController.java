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

public class LoginController implements Initializable
{    
    @FXML TextField tfPassword;
    @FXML TextField tfUsername;
    @FXML Label lbPassword;
    @FXML Label lbUsername;
    @FXML Button btnLogin;
    @FXML Button btnSignin;

    private MasterPoker main;
    private String user;
    private int coins;
    
    public void setApp(MasterPoker application)
    {
        this.main = application;
        
        if (main.getLanguage().equals("dutch"))
        {
            tfPassword.setPromptText("Voer uw wachtwoord in");
            tfUsername.setPromptText("Voer uw gebruikersnaam in");
            lbPassword.setText("Wachtwoord");
            lbUsername.setText("Gebruikersnaam");
            btnLogin.setText("Inloggen");
            btnSignin.setText("Aanmelden");
        }
        else if (main.getLanguage().equals("english"))
        {
            tfPassword.setPromptText("Add your password");
            tfUsername.setPromptText("Add your username");
            lbPassword.setText("Password");
            lbUsername.setText("Username");
            btnLogin.setText("Log in");
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
        main.goToSignin();
    }
    
    public void login()
    {
        if(tfUsername.getText().equals("Melanie") && tfPassword.getText().equals("wachtwoord"))
        {
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null, "Succesvol ingelogd");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null, "Log in succesful");
            }
            
            user = "Melanie";
            coins = 500;
            main.goToMenu(this.user, this.coins);
        }
        else if(tfUsername.getText().equals("Jos") && tfPassword.getText().equals("ww123"))
        {
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null, "Succesvol ingelogd");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null, "Log in succesful");
            }
            
            user = "Jos";
            coins = 700;
            main.goToMenu(this.user, this.coins);
        }
        else
        {
            if (main.getLanguage().equals("dutch"))
            {
                JOptionPane.showMessageDialog(null, "Uw inloggevens zijn onjuist, probeer het opnieuw");
            }
            else if (main.getLanguage().equals("english"))
            {
                JOptionPane.showMessageDialog(null, "Your sign in information is incorrect, try it again");
            }            
            
            tfUsername.setText("");
            tfPassword.setText("");
        }
    }    
    
    public void setDutch()
    {
        main.setLanguage("dutch");
        tfPassword.setPromptText("Voer uw wachtwoord in");
        tfUsername.setPromptText("Voer uw gebruikersnaam in");
        lbPassword.setText("Wachtwoord");
        lbUsername.setText("Gebruikersnaam");
        btnLogin.setText("Inloggen");
        btnSignin.setText("Aanmelden");
    }
    
    public void setEnglish()
    {
        main.setLanguage("english");
        tfPassword.setPromptText("Add your password");
        tfUsername.setPromptText("Add your username");
        lbPassword.setText("Password");
        lbUsername.setText("Username");
        btnLogin.setText("Log in");
        btnSignin.setText("Sign in");
    }
}
