package thuvien;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.awt.event.ActionEvent;

public class ThuVienController {
    public void goToSach(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/book/listsach.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Sach");
        Main.rootStage.setScene(listScene);
    }

    public void goToThanhVien(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thanhvien/listthanhvien.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thanh vien");
        Main.rootStage.setScene(listScene);
    }

    public void goToMuonSach(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/muonsach/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("Thanh vien");
        Main.rootStage.setScene(listScene);
    }
}


