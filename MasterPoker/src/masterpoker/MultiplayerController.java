package masterpoker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class MultiplayerController implements Initializable
{
    @FXML Label txtCoins;
    
    private MasterPoker main;
    private String user;
    private int coins;
    
    public void setApp(MasterPoker application, String user, int coins)
    {
        this.main = application;
        this.user = user;
        this.coins = coins;
        
        txtCoins.setText("Coins: " + this.coins);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    public void quitGame()
    {
        main.goToMenu(user, coins);
    }
}
