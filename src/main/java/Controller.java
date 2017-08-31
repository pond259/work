import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.text.DateFormat;
import  java.util.Date;
import java.time.Month;


public class Controller {

    @FXML
    protected Button button;
    public TextArea output;
    public TextField date,month,year,note;
    public String str;

    public TextField getDate() {
        return date;
    }
    public TextField getMonth() {
        return month;
    }

    public TextField getYear() {
        return year;
    }
    public TextField getNote() {
        return note;
    }

    @FXML
    public void num(ActionEvent e){
        output.setText(date.getText()+"/"+ month.getText()+"/"+year.getText()+"  :  "+note.getText()+"\n"+output.getText());
    }
}
