/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masterpoker;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class MenuController implements Initializable
{
    @FXML Label tfUser;
    @FXML Label tfCoins;    
    @FXML Tab tabHome;
    @FXML Tab tabGames;
    @FXML Tab tabTutorial;    
    @FXML ListView lvGames;
    
    private MasterPoker main;
    private String user;
    private int coins;
    
    private List<String> g;
    private ObservableList<String> games;
    
    public void setApp(MasterPoker application, String user, int coins)
    {
        this.main = application;
        this.user = user;
        this.coins = coins;         
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        tfUser.setText(this.user);
        tfCoins.setText("Coins: " + this.coins);
        
        g = new ArrayList();
        g.add("Room1, aantal spelers: 5");
        g.add("Room2, aantal spelers: 2");
        g.add("Room3, aantal spelers: 4");
        g.add("Room4, aantal spelers: 4");
        g.add("Room5, aantal spelers: 3");
        
        games = FXCollections.observableList(g);
        
        lvGames.setItems(games);
    }  
    
    public void startSingleplayer()
    {
        main.goToSingleplayer(user, coins);
    }  
    
    public void startMultiplayer()
    {
        main.goToSingleplayer(user, coins);
    } 
    
    public void logout()
    {
        main.goToLogin();
    }
}
