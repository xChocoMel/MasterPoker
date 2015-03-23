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
import javafx.scene.control.Button;
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
    @FXML Button btnSingle;
    @FXML Button btnFastMulti;
    @FXML Button btnJoin1;
    @FXML Button btnJoin2;
    @FXML Button btnJoin3;
    @FXML Label lbChoose;
    @FXML Label lbPlayers1;
    @FXML Label lbPlayers2;
    @FXML Label lbPlayers3;
    @FXML Label lbTitle;
    @FXML Button btnNewMulti;
    @FXML Button btnJoinMulti;
    @FXML Button btnLogout;
    
    private MasterPoker main;
    private String user;
    private int coins;
    
    private List<String> games;
    private ObservableList<String> oGames;
    
    public void setApp(MasterPoker application, String user, int coins)
    {
        this.main = application;
        this.user = user;
        this.coins = coins;  
        
        tfUser.setText(this.user);
        
        games = new ArrayList();
        
        if (main.getLanguage().equals("dutch"))
        {
            tfCoins.setText("Munten: " + this.coins);
            tabGames.setText("Alle spellen");
            btnSingle.setText("Single player spel staren");
            btnFastMulti.setText("Snel spelen");
            btnJoin1.setText("Meedoen");
            btnJoin2.setText("Meedoen");
            btnJoin3.setText("Meedoen");
            lbChoose.setText("of kies een spel:");
            lbPlayers1.setText("Aantal spelers: 5");
            lbPlayers2.setText("Aantal spelers: 2");
            lbPlayers3.setText("Aantal spelers: 4");
            lbTitle.setText("Alle multiplayer games");
            btnNewMulti.setText("Nieuwe game starten");
            btnJoinMulti.setText("Meedoen aan game");
            btnLogout.setText("Uitloggen");
            
            games.add("Room1, aantal spelers: 5");
            games.add("Room2, aantal spelers: 2");
            games.add("Room3, aantal spelers: 4");
            games.add("Room4, aantal spelers: 4");
            games.add("Room5, aantal spelers: 3");
        }
        else if (main.getLanguage().equals("english"))
        {
            tfCoins.setText("Coins: " + this.coins);
            tabGames.setText("All games");
            btnSingle.setText("Start single player game");
            btnFastMulti.setText("Fast play");
            btnJoin1.setText("Join");
            btnJoin2.setText("Join");
            btnJoin3.setText("Join");
            lbChoose.setText("or choose a game:");
            lbPlayers1.setText("Number of players: 5");
            lbPlayers2.setText("Number of players: 2");
            lbPlayers3.setText("Number of players: 4");
            lbTitle.setText("All multiplayer games");
            btnNewMulti.setText("Start new game");
            btnJoinMulti.setText("Join new game");
            btnLogout.setText("Log out");
            
            games.add("Room1, number of players: 5");
            games.add("Room2, number of players: 2");
            games.add("Room3, number of players: 4");
            games.add("Room4, number of players: 4");
            games.add("Room5, number of players: 3");
        }
        
        
        
        
        oGames = FXCollections.observableList(games);        
        lvGames.setItems(oGames);
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    { 
        
    }  
    
    public void startSingleplayer()
    {
        main.goToSingleplayer(user, coins);
    }  
    
    public void startMultiplayer()
    {
        main.goToMultiplayer(user, coins);
    } 
    
    public void logout()
    {
        main.goToLogin();
    }
}
