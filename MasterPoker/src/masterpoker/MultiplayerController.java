package masterpoker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class MultiplayerController implements Initializable
{
    @FXML Label txtCoins;
    @FXML ListView lvChat;
    @FXML TextField tfMessage;
    
    private MasterPoker main;
    private String user;
    private int coins;
    
    private List<String> messages;
    private ObservableList<String> oMessages;
    
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
    public void initialize(URL url, ResourceBundle rb)
    {
        messages = new ArrayList();
        messages.add("Jos - Well played");
        messages.add("Brian - Thanks mate");
        
        oMessages = FXCollections.observableList(messages);        
        lvChat.setItems(oMessages);
    }   
    
    public void quitGame()
    {
        main.goToMenu(user, coins);
    }
    
    public void sendChatmessage()
    {
        String message = tfMessage.getText();
        oMessages.add(this.user + " - " + message);
        tfMessage.setText("");
    }
}
