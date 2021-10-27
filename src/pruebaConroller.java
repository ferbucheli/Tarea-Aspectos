


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;

public class pruebaConroller implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private Button btnRojo;

    @FXML
    private Button btnverde;

    @FXML
    private Button btnAzul;

    @FXML
    void cambiarAzul(MouseEvent event) {
    	pane.setStyle("-fx-background-color: blue");
    	System.out.println("Color Azul");
    }

    @FXML
    void cambiarRojo(MouseEvent event) {
    	pane.setStyle("-fx-background-color: red");
    	System.out.println("Color Rojo");
    	
    }

    @FXML
    void cambiarVerde(MouseEvent event) {
    	pane.setStyle("-fx-background-color: green");
    	System.out.println("Color Verde");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
