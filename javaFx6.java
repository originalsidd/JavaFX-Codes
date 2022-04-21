// JavaFX TextField Actions

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;

public class javaFx6 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Pane root = new Pane();

		Font font = Font.font("Calibri", FontWeight.BOLD, 20);

		PasswordField pf = new PasswordField();
		pf.setPromptText("Enter password");
		
		TextField tf = new TextField("Enter your name: ");
		tf.setFont(font);
		tf.setPrefColumnCount(28);
		tf.setAlignment(Pos.CENTER);

		tf.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.out.println("Enter Pressed: " + tf.getText());
			}
		});

		tf.setOnKeyPressed(new EventHandler<KeyEvent>() {
			public void handle(KeyEvent e) {
				String s = tf.getText();
				System.out.print(s.charAt(s.length()-1));
			}
		});

		// tf.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
		// 	public void handle(KeyEvent e) {

		// 	}
		// });

		root.getChildren().addAll(tf, pf);

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}