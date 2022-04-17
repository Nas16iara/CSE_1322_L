package ranasiac.classwork;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class Controller {
    public TextField numb1;
    public TextField numb2;
    public Button clearNumbs;
    public Button addNumbs;
    public Pane myPane;
    public Label resultNumb;
    public void pressedAddButton(ActionEvent actionEvent) {
       int number2= Integer.parseInt(numb2.getText());
       int number1= Integer.parseInt(numb1.getText());
       int number3=(number1+number2);
       String numberR=Integer.toString(number3);
       resultNumb.setText(numberR);
    }
    public void pressedClear(ActionEvent actionEvent) {
        resultNumb.setText("");
        numb2.setText("");
        numb1.setText("");
    }

}