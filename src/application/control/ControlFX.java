package application.control;

import java.io.IOException;

import application.control.MainFx;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ControlFX {

	/**
     * Opens an stage to send the profile
     */
    public void showSend() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainFx.class.getResource("../vista/Send.fxml"));
            BorderPane page = (BorderPane) loader.load();
            
            //Create the Second stage
            Stage sendStage = new Stage();
            sendStage.setTitle("Please complete this :)");
            Scene scene = new Scene(page);
             sendStage.setScene(scene);

            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
    /**
     * Shows the SEnd stage
     * @see showSend
     */
    @FXML
	public void sendStage(){
		showSend();
	}
	
	/**
	 * Method to close yhe program
	 */
    @FXML
	public void closeStage(){
		 System.exit(0);
	}
}
