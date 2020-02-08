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
        Button b1 = new Button("Smol");//creating new button(Button on JavaFX!!)
        Button b2 = new Button("Smoln't");//creating new button(Button on JavaFX!!)
        primaryStage.setMinWidth(300);//redacting size of app-window
        primaryStage.setMinHeight(500);//redacting size of app-window
       b1.setLayoutX(0);//changing position on X(button1)
       b1.setLayoutY(0);//changing position on Y(button1)
       b1.setMinSize(150,150);//redacting size of button1
       b2.setMinSize(150,150);//redacting size of button2
       b2.setLayoutX(150);//changing position on X(button2)
       b2.setLayoutY(0);//changing position on Y(button2)

       Text txt = new Text("Some cool text");
       txt.setLayoutX(50);
       txt.setLayoutY(120);
       txt.setVisible(true);

        Group gr = new Group(b1,b2,txt);//you need to add all elements you need here



b1.setOnAction(actionEvent ->{// this code is equivalent for code like>>if(button clicked){do some thing}
    primaryStage.setFullScreen(true);//if(button clicked){set app to full screen}
primaryStage.setTitle(" Half life 3");//if(button clicked){change title of program}
});
    b2.setOnAction(actionEvent1 -> {//same thing like b1
        primaryStage.setFullScreen(false);
        primaryStage.setTitle("not Half life 3");
    });



        primaryStage.setScene(new Scene(gr, 300, 275));//all app elements; default width and height you need
        primaryStage.show();//like(setVisible(true) to all app with all elements)

    }


    public static void main(String[] args) {
        launch(args);
    }//don't touch this thing!
}
