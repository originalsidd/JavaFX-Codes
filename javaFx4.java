// JavaFX Event Handling - addEventHandler

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.input.*;

public class javaFx4 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		FlowPane root = new FlowPane();

		Button b1 = new Button("Submit");
		Button b2 = new Button("Cancel");
		Button b3 = new Button("Save");
		Button b4 = new Button("Exit");

		Label lb = new Label("Hello There!");

		// 4 ways to implement event handling- inner class/object, ref. object,
		// method-local (Anonymouse) inner class object, lambda

		// b1.addEventHandler(-,-) -> if applied to both root node and child node, 
		// child node handled first then root node [child -> root]

		// b1.addEventFilter(-,-) -> if applied to both root node and child node, 
		// root node handled first then child node [root -> child]

		class NewEvent implements EventHandler<ActionEvent> {
			public void handle(ActionEvent ae) {
				System.out.println("Submit button pressed");
				lb.setText("Submitted!");
			}
		}

		b1.addEventHandler(ActionEvent.ACTION, new NewEvent());

		EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.out.println("Cancel button pressed");
				lb.setText("Cancelled!");
			}
		};

		b2.addEventHandler(ActionEvent.ACTION, event);

		b3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.out.println("This will be processed too");
				lb.setText("Nothing!");
			}
		});

		b3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.out.println("This will be processed");
				lb.setText("Nothing!");
			}
		});

		b3.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				System.out.println("Save button is pressed");
				lb.setText("Saved!");
			}
		});
		// Only last listener will be considered for multiple same type of listener on
		// single source object

		b3.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			public void handle(MouseEvent ae) {
				System.out.println("Mouse moved!");
			}
		});

		b3.addEventHandler(MouseEvent.MOUSE_EXITED, ae -> {
			lb.setText("Hello There!");
		});

		b4.addEventHandler(ActionEvent.ACTION, ae -> {
			System.out.println("Exit button is pressed");
			lb.setText("Exit!");
		});

		root.getChildren().addAll(lb, b1, b2, b3, b4);

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}