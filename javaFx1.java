// JavaFX Introduction and Shapes/attributes 

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
// import javafx.scene.PerspectiveCamera;
// import javafx.collections.*;
// import javafx.collections.ObservableList;

public class javaFx1 extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	public void start(Stage stage) throws Exception {

		// double values in parameters
		Line l1 = new Line(240, 100, 300, 160);
		Line l2 = new Line(0, 230, 1000, 230);
		// l1.setStartX(100);
		// l1.setStartY(200);
		// l1.setEndX(300);
		// l1.setEndY(350);

		Rectangle r1 = new Rectangle(100, 100, 200, 100);
		// r1.setX(100);
		// r1.setY(100);
		// r1.setWidth(200);
		// r1.setHeight(100);
		r1.setArcHeight(20);
		r1.setArcWidth(20);
		r1.setFill(Color.rgb(200, 20, 20, 1));
		r1.setSmooth(true);
		r1.setStroke(Color.BLUE);
		r1.setStrokeWidth(2);

		Circle c1 = new Circle();
		c1.setCenterX(150);
		c1.setCenterY(200);
		c1.setRadius(30);
		Circle c2 = new Circle(250, 200, 30);

		Ellipse e1 = new Ellipse(100, 170, 5, 15);
		Ellipse e2 = new Ellipse(300, 170, 5, 15);
		e1.setFill(Color.rgb(255, 60, 0));
		e2.setFill(Color.rgb(255, 255, 0));
		// e1.setCenterX(400);
		// e1.setCenterY(400);
		// e1.setRadiusX(50);
		// e1.setRadiusY(70);
		Arc a1 = new Arc(400, 250, 50, 30, 30, 60);
		a1.setType(ArcType.OPEN);

		double[] d = { 300, 400, 500, 550, 500, 600, 550, 600, 500, 300, 400 };

		Polygon p1 = new Polygon(d);
		p1.setFill(Color.rgb(20, 20, 20, 0.5));

		// Box b1 = new Box();
		// b1.setHeight(100);
		// b1.setWidth(200);
		// b1.setDepth(300);
		// b1.setTranslateX(250);
		// b1.setTranslateY(350);
		// b1.setTranslateZ(300);
		// PerspectiveCamera pc = new PerspectiveCamera();
		// pc.setTranslateX(100);
		// pc.setTranslateY(150);
		// pc.setTranslateZ(300);

		// Group root = new Group(l1);
		Group root = new Group();
		// ObservableList ol = root.getChildren();
		// ol.addAll(l1, l2);
		root.getChildren().addAll(l2, r1, c1, c2, l1, e1, e2, a1, p1);

		Scene scene = new Scene(root, 600, 400, Color.rgb(100, 100, 150, 0.5));
		// scene.setCamera(pc);

		stage.setTitle("Sample application");
		stage.setScene(scene);
		stage.show();
	}
}