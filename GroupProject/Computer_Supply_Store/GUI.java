
package Computer_Supply_Store;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage stage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20, 20, 20, 20));
        Text scenetitle = new Text("--l Welcome to the Computer Supply Store System l--");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.BOLD, 18));
        scenetitle.setFill(Color.RED);
        grid.add(scenetitle, 1, 0, 5, 1);
        grid.setBackground(new Background(new BackgroundFill(Color.MISTYROSE, null, null)));

        // products LABEL
        Label products = new Label("l Products l");
        grid.add(products, 1, 4);
        products.setFont(Font.font("Tahoma", FontWeight.BOLD, 16));
        products.setTextFill(Color.RED);
        // Button
        Button btn = new Button("Show products");
        grid.add(btn, 1, 5);
        btn.setTextFill(Color.WHITE);
        btn.setBackground(new Background(new BackgroundFill(Color.TOMATO, null, null)));
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                // ArrayList display
                TextArea textarea = new TextArea();
                grid.add(textarea, 2, 2, 4, 6);
                ArrayList<Products> list = Main.products;
                String bb = "";
                for (Products products : list) {
                    bb += products + "\n";
                }
                textarea.setText(bb);
                textarea.setEditable(false);
            }
        });

        Scene scene = new Scene(grid, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Computer-Supply Store");
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}