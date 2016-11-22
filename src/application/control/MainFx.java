package application.control;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * Class to lanch the fxml Profile
 * @author Daniel Morgado Jara
 * @version 1.0
 * @since 22-11-16
 * @see ../aplicacion.vista/Profile.fxml
 */
public class MainFx extends Application {
	
	/**
	 * AnchorPane that make our proyect of a size in the start
	 * @see initRoot
	 */
	private BorderPane rootLayout;
	
	/**
	 * my Stage is public becous it can be update
	 * @see initRoot
	 */
	public Stage primaryStage;

	
	/**
	 * Class to be use when the program is launch
	 */
	@Override
	public void start(Stage primaryStage) {
try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Profile");
			this.primaryStage.setX(600);
			this.primaryStage.setY(400);

			primaryStage.show();
			
			initRootLayout();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/**
	 * loads the layout
	 */
	public void initRootLayout() {
		try {
			// Load root layout from fxml file. 
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainFx.class.getResource("../vista/Profile.fxml"));
			rootLayout = (BorderPane) loader.load();

			// Show the scene containing the root layout.
			Scene scene = new Scene(rootLayout, 600, 400);
			scene.getStylesheets().add(
					getClass().getResource("application.css").toExternalForm());
			

			//			adding fonts
			//scene.getStylesheets().add("https://fonts.googleapis.com/css?family=HipsterishFontNormal");
            Font.loadFont(getClass().getResourceAsStream("../vista/assets/fonts/HipsterishFontNormal.ttf"), 20);

			
			primaryStage.setScene(scene);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
