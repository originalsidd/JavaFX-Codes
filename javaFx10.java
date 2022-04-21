// JavaFX Ellipse Simulation using Keys

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.event.*;

public class javaFx10 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Pane root = new Pane();

		TextField tf = new TextField();
		Ellipse e = new Ellipse(100, 150, 50, 75);

		root.getChildren().addAll(tf, e);

		tf.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent ke) {
				KeyCode code = ke.getCode();
				switch(code) {
					case UP:
						e.setRadiusY(e.getRadiusY() + 5); 
						break;
					case DOWN:
						e.setRadiusY(e.getRadiusY() - 5); 
						break;
					case LEFT:
						e.setRadiusX(e.getRadiusX() - 5); 
						break;
					case RIGHT:
						e.setRadiusX(e.getRadiusX() + 5); 
						break;
					default:
						System.out.println(code);
				}
			}
		});

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}