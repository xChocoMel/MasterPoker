/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package masterpoker;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Melanie
 */
public class MasterPoker extends Application
{
    private Stage stage;
    private String language;

    @Override
    public void start(Stage stage) throws Exception 
    {
        language = "dutch";
        
        try
        {
            this.stage = stage;
            this.stage.setTitle("MasterPoker");
            this.stage.setMinWidth(200);
            this.stage.setMinHeight(200);
            goToLogin();          

            this.stage.show();
        }
        catch (Exception ex)
        {
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     /**
     * Load LoginFXML.fxml
     */
    protected void goToLogin()
    {
        try
        {
            LoginController login = (LoginController)replaceSceneContent("LoginFXML.fxml");
            login.setApp(this);
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Load SigninFXML.fxml
     */
    protected void goToSignin()
    {
        try
        {
            SigninController signin = (SigninController)replaceSceneContent("SigninFXML.fxml");
            signin.setApp(this);
        }
        catch (Exception ex)
        {
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Load MenuFXML.fxml
     */
    protected void goToMenu(String user, int coins)
    {
        try
        {
            MenuController menu = (MenuController)replaceSceneContent("MenuFXML.fxml");
            menu.setApp(this, user, coins);
        }
        catch (Exception ex)
        {
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Load SingleplayerFXML.fxml
     */
    protected void goToSingleplayer(String user, int coins)
    {
        try
        {
            SingleplayerController single = (SingleplayerController)replaceSceneContent("SingleplayerFXML.fxml");
            single.setApp(this, user, coins);
        }
        catch (Exception ex)
        {
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Load MultiplayerFXML.fxml
     */
    protected void goToMultiplayer(String user, int coins)
    {
        try
        {
            MultiplayerController multi = (MultiplayerController)replaceSceneContent("MultiplayerFXML.fxml");
            multi.setApp(this, user, coins);
        }
        catch (Exception ex)
        {
            Logger.getLogger(MasterPoker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Replace scene content
     * @param fxml fxmlfilename
     * @return controller of root
     * @throws Exception 
     */
    private Initializable replaceSceneContent(String fxml) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        InputStream in = MasterPoker.class.getResourceAsStream(fxml);
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(MasterPoker.class.getResource(fxml));
        AnchorPane page = null;
        
        try
        {
            page = (AnchorPane)loader.load(in);
        }
        finally
        {
            in.close();
        }
        
        Scene scene = null;
        this.stage.setMinWidth(200);
        this.stage.setMinHeight(200);
        scene = new Scene(page);
        
        if (scene != null)
        {
            stage.setTitle("MasterPoker");
            stage.setScene(scene);
        }
        else
        {
            System.out.println("Creating scene failed");
        }        
        
        stage.sizeToScene();
        return (Initializable) loader.getController();
    }
    
    /**
     * Get current stage
     * @return stage
     */
    public Stage getstage()
    {
        return this.stage;
    }
    
    public String getLanguage()
    {
        return this.language;
    }
    
    public void setLanguage(String language)
    {
        this.language = language;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }    
}
