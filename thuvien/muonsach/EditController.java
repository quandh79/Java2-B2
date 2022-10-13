package thuvien.muonsach;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import thuvien.Main;
import thuvien.thanhvien.Thanhvien;

import java.net.URL;
import java.util.ResourceBundle;

public class EditController {
    public TextField txtMaSach;
    public TextField txtThannhVien;
    public TextField txtNgayMuon;
    public TextField txtNgayTra;


    public void submit(javafx.event.ActionEvent actionEvent){
        try {

            if (txtMaSach.getText().isEmpty() || txtThannhVien.getText().isEmpty() || txtNgayMuon.getText().isEmpty() || txtNgayTra.getText().isEmpty() ){
                throw new Exception("Vui long nhap du lieu");
            }
            thuvien.thanhvien.ListController.list.add(new Thanhvien(txtMaSach.getText(), txtThannhVien.getText(), txtNgayMuon.getText(),txtNgayTra.getText()));
            goToList(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public void initialize(URL location, ResourceBundle resources){
        try {
            if(thuvien.thanhvien.ListController.editItem == null){
                goToList(null);
            }
            txtMaSach.setText(thuvien.muonsach.ListController.editItem.getMaSach());
            txtThannhVien.setText(thuvien.muonsach.ListController.editItem.getMaThanhVien());
            txtNgayMuon.setText(thuvien.muonsach.ListController.editItem.getNgayMuon());
            txtNgayTra.setText(thuvien.muonsach.ListController.editItem.getNgayTra());

        }catch (Exception e){

        }

    }



    public void goToList(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/muonsach/list.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("menu");
        Main.rootStage.setScene(listScene);
    }


}
