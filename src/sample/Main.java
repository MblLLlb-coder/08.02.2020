package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Button b1 = new Button("Smol");
        Button b2 = new Button("Smoln't");
        primaryStage.setMinWidth(300);
        primaryStage.setMinHeight(500);
       b1.setLayoutX(0);
       b1.setLayoutY(0);
       b1.setMinSize(150,150);
       b2.setMinSize(150,150);
       b2.setLayoutX(150);
       b2.setLayoutY(0);

       Text txt = new Text("Some cool text");
       txt.setLayoutX(50);
       txt.setLayoutY(120);
       txt.setVisible(true);

        Group gr = new Group(b1,b2,txt);



b1.setOnAction(actionEvent ->{
    primaryStage.setFullScreen(true);
primaryStage.setTitle(" Half life 3");
});
    b2.setOnAction(actionEvent1 -> {
        primaryStage.setFullScreen(false);
        primaryStage.setTitle("not Half life 3");
    });



        primaryStage.setScene(new Scene(gr, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
