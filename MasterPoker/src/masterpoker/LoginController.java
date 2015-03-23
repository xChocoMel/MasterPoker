/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masterpoker;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

    public void register(){
        //open register screen
    }
    
    public void login(){
        if(tfUsername.getText().equals("Melanie") && tfPassword.getText().equals("Brian")){
            //open Homescreen
        }
        else{
            tfUsername.setText("");
            tfPassword.setText("");
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
