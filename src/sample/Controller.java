package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {
    @FXML
    private Label skaicius;
    @FXML
    private TextField spejimas;

    public void speti(ActionEvent event){
        Random random = new Random();
        int rand = random.nextInt(10)+1;
        int y = Integer.parseInt(spejimas.getText());
        if(y == rand) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saunuolis");
            alert.show();
            //skaicius.setText("Saunuolis");
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Neatspejai " + rand);
            alert.show();
            //skaicius.setText("Neatspejai " + rand);
        }

    }
    public void baigti(ActionEvent event){
        System.exit(0);
    }
}
