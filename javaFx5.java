// JavaFX Event Handling - common EventHandler listener object for all buttons and getSource

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.event.*;
import javafx.geometry.*;

public class javaFx5 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane();
		
		Font font = Font.font("Times New Roman", FontWeight.BOLD, 28);
		Font font2 = Font.font("Times New Roman", FontWeight.BOLD, 18);
		Font font3 = Font.font("Arial", FontWeight.MEDIUM, 16);

		Button b1 = new Button("Submit");
		Button b2 = new Button("Cancel");
		Button b3 = new Button("Save");
		Button b4 = new Button("Exit");

		Label lb = new Label("Hello There!");
		lb.setFont(font);

		TextField tf = new TextField("Enter your name: ");
		tf.setFont(font3);
		tf.setPrefColumnCount(30);
		tf.setAlignment(Pos.CENTER);

		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				String s;
				if (ae.getSource() == b1) {
					s = "Submit";
				}
				else if (ae.getSource() == b2) {
					s = "Cancel";
				}
				else if (ae.getSource() == b3) {
					s = "Save";
				} else {
					s = "Exit";
				}
				lb.setText(s);
				System.out.println(s + " button pressed");
			}
		};
		b1.setOnAction(event);
		b2.setOnAction(event);
		b3.setOnAction(event);
		b4.setOnAction(event);
		b1.setDefaultButton(true);
		b2.setCancelButton(true);
		b3.setMnemonicParsing(true);
		b3.setText("_click me");
		b1.setFont(font2);
		b2.setFont(font2);
		b3.setFont(font2);
		b4.setFont(font2);
		// b.setText("test");
		// b.setDisabled(true);
		// b.setWrapText(true);
		// b.setGraphic(ImageView iv);
		// b.setMaxWidth(50);
		// b.setMaxHeight(70);
		// b.setMaxSize(50, 70));
		// b.setDefaultButton(true); will be clicked if enter key pressed
		// b.setCancelButton(true); will be clicked if esc key pressed
		// b.setMnemonicParsing(true);
		// b.setText("_PressMe"); button activated by pressing alt+P since _ before P
		// b.setText("Pr_essMe"); button activated by pressing alt+e since _ before e

		root.getChildren().addAll(lb, b1, b2, b3, b4, tf);

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}