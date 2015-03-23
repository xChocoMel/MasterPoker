package masterpoker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javax.swing.Timer;

/**
 * FXML Controller class
 *
 * @author Melanie
 */
public class MultiplayerController implements Initializable {

    @FXML
    Label txtCoins;
    @FXML
    Label txtSpeler1;
    @FXML
    Label txtSpeler2;
    @FXML
    Label txtSpeler3;
    @FXML
    Label txtSpeler4;
    @FXML
    Label txtSpeler5;
    @FXML
    Label txtSpeler6;
    @FXML
    Button btnPassen;
    @FXML
    Button btnMeegaan;
    @FXML
    Button btnInzetten;

    private MasterPoker main;
    private String user;
    private int coins;
    private int count = 0;
    private int maxcount = 5;
    Timer timer;

    public void setApp(MasterPoker application, String user, int coins) {
        this.main = application;
        this.user = user;
        this.coins = coins;

        txtCoins.setText("Coins: " + this.coins);
        txtSpeler1.setText(this.user);
        txtSpeler1.setTextFill(Color.RED);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    
    public void startTimer() {
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
    }

    public void quitGame() {
        main.goToMenu(user, coins);
    }

    public void inzetten() throws InterruptedException {
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
    }

    public void resetButtons() {
        btnMeegaan.setDisable(false);
        btnPassen.setDisable(false);
        btnInzetten.setDisable(false);
    }
}
