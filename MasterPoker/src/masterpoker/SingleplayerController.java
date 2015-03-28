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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class SingleplayerController implements Initializable
{    
    @FXML Label lbPlayer;
    @FXML Label txtCoins;
    @FXML Button btnMenu;
    @FXML Button btnFold;
    @FXML Button btnCall;
    @FXML Button btnRaise;
    @FXML CheckBox chAuto;
    
    private MasterPoker main;
    private String user;
    private int coins;
    
    public void setApp(MasterPoker application, String user, int coins)
    {
        this.main = application;
        this.user = user;
        this.coins = coins;
        
        lbPlayer.setText(this.user);
        
        if (main.getLanguage().equals("dutch"))
        {
            txtCoins.setText("Munten: " + this.coins);
            btnMenu.setText("Terug naar menu");
            btnFold.setText("Passen");
            btnCall.setText("Meegaan");
            btnRaise.setText("Inzetten");
            chAuto.setText("Altijd meegaan");            
        }
        else if (main.getLanguage().equals("english"))
        {
            txtCoins.setText("Coins: " + this.coins);
            btnMenu.setText("Back to menu");
            btnFold.setText("Fold");
            btnCall.setText("Call");
            btnRaise.setText("Raise");
            chAuto.setText("Always call");
        }
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
