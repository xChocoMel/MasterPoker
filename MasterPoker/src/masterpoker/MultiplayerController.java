package masterpoker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javafx.scene.paint.Color;
import javax.swing.Timer;

import javafx.scene.control.CheckBox;
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
    @FXML Button btnMenu;
    @FXML Button btnSend;
    @FXML Button btnFold;
    @FXML Button btnCall;
    @FXML Button btnRaise;
    @FXML CheckBox chAuto;
    @FXML Label lbPlayer1;
    @FXML Label lbPlayer2;
    @FXML Label lbPlayer3;
    @FXML Label lbPlayer4;
    @FXML Label lbPlayer5;
    @FXML Label lbPlayer6;
    
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
        
        lbPlayer1.setText(this.user);
        
        if (main.getLanguage().equals("dutch"))
        {
            txtCoins.setText("Munten: " + this.coins);
            btnMenu.setText("Terug naar menu");
            btnSend.setText("Versturen");
            btnFold.setText("Passen");
            btnCall.setText("Meegaan");
            btnRaise.setText("Inzetten");
            chAuto.setText("Altijd meegaan");
            lbPlayer2.setText("Speler 2");
            lbPlayer3.setText("Speler 3");
            lbPlayer4.setText("Speler 4");
            lbPlayer5.setText("Speler 5");
            lbPlayer6.setText("Speler 6");
        }
        else if (main.getLanguage().equals("english"))
        {
            txtCoins.setText("Coins: " + this.coins);
            btnMenu.setText("Back to menu");
            btnSend.setText("Send");
            btnFold.setText("Fold");
            btnCall.setText("Call");
            btnRaise.setText("Raise");
            chAuto.setText("Always call");
            lbPlayer2.setText("Player 2");
            lbPlayer3.setText("Player 3");
            lbPlayer4.setText("Player 4");
            lbPlayer5.setText("Player 5");
            lbPlayer6.setText("Player 6");
        }
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
   /* public void startTimer() {
        count = 0;
         timer = new Timer(1000, (ActionEvent ae) -> {
            if(count < maxcount)
            {
                count++;
                System.out.println(count);
            }
            else            
            {
                ((Timer) ae.getSource()).stop();
                System.out.println("Volgende is aan de beurt!");
                
            }
        });
          timer.start();
    }*/

    public void quitGame() {
        main.goToMenu(user, coins);
    }

  /*  public void inzetten() throws InterruptedException {
        txtSpeler1.setTextFill(Color.BLACK);
        btnMeegaan.setDisable(true);
        btnPassen.setDisable(true);
        btnInzetten.setDisable(true);
        startTimer(); 

    }

    public void passen() {
        txtSpeler1.setTextFill(Color.BLACK);
        btnMeegaan.setDisable(true);
        btnPassen.setDisable(true);
        btnInzetten.setDisable(true);
        startTimer(); 
    }

    public void meegaan() {
        txtSpeler1.setTextFill(Color.BLACK);
        btnMeegaan.setDisable(true);
        btnPassen.setDisable(true);
        btnInzetten.setDisable(true);
        startTimer();
    }*/

    public void sendChatmessage()
    {
        String message = tfMessage.getText();
        oMessages.add(this.user + " - " + message);
        tfMessage.setText("");

    }
}
