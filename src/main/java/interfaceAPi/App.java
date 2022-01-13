package interfaceAPi;


import interfaceAPi.UI.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

private RootController mainController;
	
private static Stage primaryStage;
	
	public void start(Stage primaryStage) throws Exception {
		
		App.setPrimaryStage(primaryStage);

		mainController = new RootController();
		
		Scene scene = new Scene(mainController.getView());
		
		primaryStage.setTitle("GeoFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);

	}




	public static Stage getPrimaryStage() {
		return primaryStage;
	}




	public static void setPrimaryStage(Stage primaryStage) {
		App.primaryStage = primaryStage;
	}

}
