// JavaFX Structured Tree Heirarchy

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.event.*;

public class javaFx8 extends Application {
	double startx, starty, endx, endy;
	Line newline;
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Pane parent = new Pane();
		Pane grand_parent = new Pane();
		
		newline = new Line();
		TextField tf = new TextField("Enter your name");
		Button b1 = new Button("Submit");
		Circle c = new Circle(100, 150, 50);

		parent.getChildren().addAll(c);
		grand_parent.getChildren().addAll(tf, b1, parent, newline);
		
		EventHandler<MouseEvent> event1 = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				// startx = me.getX();
				// starty = me.getY();
				endx = me.getX();
				endy = me.getY();
				// newline = new Line(startx, starty, endx, endy);
				// grand_parent.getChildren().addAll(newline);
			}
		};

		grand_parent.addEventHandler(MouseEvent.MOUSE_PRESSED, event1);

		EventHandler<MouseEvent> event2 = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				startx = endx;
				starty = endy;
				endx = me.getX();
				endy = me.getY();
				newline = new Line(startx, starty, endx, endy);
				grand_parent.getChildren().addAll(newline);
			}
		};
		
		grand_parent.addEventHandler(MouseEvent.MOUSE_PRESSED, event2);
		grand_parent.addEventHandler(MouseEvent.MOUSE_DRAGGED, event2);
		grand_parent.addEventHandler(MouseEvent.MOUSE_RELEASED, event2);
		
		EventHandler<MouseEvent> event = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				c.setCenterX(me.getX());
				c.setCenterY(me.getY());
			}
		};

		c.addEventHandler(MouseEvent.MOUSE_PRESSED, event);
		c.addEventHandler(MouseEvent.MOUSE_DRAGGED, event);
		c.addEventHandler(MouseEvent.MOUSE_RELEASED, event);
		c.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				grand_parent.removeEventHandler(MouseEvent.MOUSE_PRESSED, event1);
				grand_parent.removeEventHandler(MouseEvent.MOUSE_PRESSED, event2);
				grand_parent.removeEventHandler(MouseEvent.MOUSE_DRAGGED, event2);
				grand_parent.removeEventHandler(MouseEvent.MOUSE_RELEASED, event2);
			}
		});
		c.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				grand_parent.addEventHandler(MouseEvent.MOUSE_PRESSED, event1);
				grand_parent.addEventHandler(MouseEvent.MOUSE_PRESSED, event2);
				grand_parent.addEventHandler(MouseEvent.MOUSE_DRAGGED, event2);
				grand_parent.addEventHandler(MouseEvent.MOUSE_RELEASED, event2);
			}
		});
		// c.setOnMouseEntered();
		// c.setOnMouseExited();


		Scene scene = new Scene(grand_parent, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}