package application;
	


import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage stage) {
		try {
			Parent root=FXMLLoader.load(getClass().getResource("ventana.fxml"));
			stage.setTitle("Inicio");
			Scene scene=new Scene(root,400,200);
	        stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
