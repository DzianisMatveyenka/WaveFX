package sample;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.paint.RadialGradientBuilder;
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import java.util.*;

public class Main extends Application {

    private final Paint background = RadialGradientBuilder.create()
            .stops(new Stop(0d, Color.TURQUOISE), new Stop(1, Color.web("3A5998")))
            .centerX(0.5d).centerY(0.5d).build();


    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);


        Button addWaveButton = new Button("+");
        addWaveButton.setAlignment(Pos.CENTER);
        root.add(addWaveButton, 0, 0);
        GridPane.setHalignment(addWaveButton, HPos.CENTER);
        GridPane waveField = new GridPane();
        root.add(waveField, 0, 1);
        waveField.setPadding(new Insets(5));
        waveField.setStyle("-fx-background-color: black; -fx-padding: 2; -fx-hgap: 2; -fx-vgap: 2;");
        waveField.setHgap(5);
        waveField.setVgap(5);

        for (int rowIndex = 0; rowIndex < 7; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 25; columnIndex++) {
                Button button = new Button("");
                button.setPrefSize(20, 20);
                button.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
                waveField.add(button, columnIndex, rowIndex);
            }
        }

        Scene scene = new Scene(root, background);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String... args) {
        List<int[]> list = new ArrayList<int[]>();
        String[] arr = new String[] {"asd", "asdas"};
        Arrays.asList(arr);
        Set<String> set = new HashSet<String>();
    }
}

