// JavaFX Moving Circle Graphic with Mouse

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.event.*;

public class javaFx7 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {
		Pane root = new Pane();

		Circle c = new Circle(100, 150, 50);

		root.getChildren().addAll(c);

		EventHandler<MouseEvent> event = new EventHandler<MouseEvent>() {
			public void handle(MouseEvent me) {
				c.setCenterX(me.getX());
				c.setCenterY(me.getY());
			}
		};

		c.addEventHandler(MouseEvent.MOUSE_PRESSED, event);
		c.addEventHandler(MouseEvent.MOUSE_DRAGGED, event);
		c.addEventHandler(MouseEvent.MOUSE_RELEASED, event);

		Scene scene = new Scene(root, 600, 400, Color.rgb(255, 255, 255, 1));

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}