import javafx.scene.control.Alert;

public aspect Funcionalidad {

	pointcut cambioColor() : execution(* cambiar*(..) );
	after() : cambioColor(){
		Alert A1= new Alert(Alert.AlertType.CONFIRMATION,"Se ha cambiado de color");
        A1.show();
	}
}
