package thuvien.thanhvien;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import thuvien.Main;
import thuvien.thanhvien.Thanhvien;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable  {
    public ListView<Thanhvien> lv;
    public static ObservableList<Thanhvien> list = FXCollections.observableArrayList();

    public static Thanhvien editItem;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lv.setItems(list);
    }

    public void goToForm(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thanhvien/form.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thêm sach");
        Main.rootStage.setScene(listScene);
    }

    public void goToEdit(ActionEvent actionEvent) throws Exception{
        editItem = lv.getSelectionModel().getSelectedItem();
        if(editItem == null) return;
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thanhvien/edit.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Sửa sach");
        Main.rootStage.setScene(listScene);
    }

    public void goToMenu(ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thuvien.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("menu");
        Main.rootStage.setScene(listScene);
    }


}
