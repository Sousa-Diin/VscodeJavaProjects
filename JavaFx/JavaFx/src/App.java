import javafx.application.Application;
import javafx.event.ActionEvent;
//import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage arg0) throws Exception {
        
        arg0.setTitle("Simulador");
        Button botton = new Button("Iniciar");

        botton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                
                System.out.println("Iniciando simulacão...");
                
            }
            
        });
        
        StackPane root = new StackPane();
        root.getChildren().addAll(botton);
        arg0.setScene(new Scene(root, 400, 350));
        arg0.show();

    }
}
