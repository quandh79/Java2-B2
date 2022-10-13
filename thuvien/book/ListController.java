package thuvien.book;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;
import thuvien.Main;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ListController implements Initializable  {
    public ListView<Book> lv;
    public static ObservableList<Book> list = FXCollections.observableArrayList();

    public static Book editItem;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(list);
    }

    public void goToForm(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/book/sach.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm sach");
        Main.rootStage.setScene(listScene);
    }

    public void goToEdit(ActionEvent actionEvent) throws Exception{
        editItem = lv.getSelectionModel().getSelectedItem();
        if(editItem == null) return;
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/book/editsach.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Sửa sach");
        Main.rootStage.setScene(listScene);
    }

    public void goToMenu(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thuvien.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("menu");
        Main.rootStage.setScene(listScene);
    }


}
