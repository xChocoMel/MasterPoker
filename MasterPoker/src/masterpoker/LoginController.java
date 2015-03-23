/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masterpoker;

import java.net.URL;
import java.rmi.RemoteException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class LoginController implements Initializable
{
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
}
