package interfaceAPi;


import interfaceAPi.UI.RootController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class App extends Application{

private RootController mainController;
	
private static Stage primaryStage;
	
	public void start(Stage primaryStage) throws Exception {
		
		App.primaryStage = primaryStage;

		mainController = new RootController();
		
		Scene scene = new Scene(mainController.getView());
		
		primaryStage.setTitle("Acceso a Ficheros");
		//primaryStage.getIcons().add(new Image("/images/fx-64x64.png"));
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	
	
	public static void main(String[] args) {
		launch(args);

	}

}
