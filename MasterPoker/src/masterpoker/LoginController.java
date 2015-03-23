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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Melanie
 */

public class LoginController implements Initializable
{    
    @FXML Button inlogButton;
    @FXML Button registerButton;
    @FXML TextField tfPassword;
    @FXML TextField tfUsername;

    private MasterPoker main;
    private String user;
    private int coins;
    
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
        main.goToSignin();
    }
    
    public void login()
    {
        if(tfUsername.getText().equals("Melanie") && tfPassword.getText().equals("Brian"))
        {
            user = "Melanie";
            coins = 500;
            main.goToMenu(this.user, this.coins);
        }
        else
        {
            tfUsername.setText("");
            tfPassword.setText("");
        }
    }     
}
