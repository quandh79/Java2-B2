package thuvien.thanhvien;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import thuvien.Main;
import thuvien.thanhvien.Thanhvien;
import thuvien.book.ListController;

import java.net.URL;
import java.util.ResourceBundle;

public class EditController implements Initializable {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtAddress;
    public TextField txtPhone;




    public void initialize(URL location, ResourceBundle resources){
        try {
            if(thuvien.thanhvien.ListController.editItem == null){
                goToList(null);
            }
            txtCode.setText(thuvien.thanhvien.ListController.editItem.getCode());
            txtName.setText(thuvien.thanhvien.ListController.editItem.getName());
            txtAddress.setText(thuvien.thanhvien.ListController.editItem.getAddress());
            txtPhone.setText(thuvien.thanhvien.ListController.editItem.getPhone());

        }catch (Exception e){

        }

    }

    public void submit(javafx.event.ActionEvent actionEvent){
        try {

            if (txtCode.getText().isEmpty() || txtName.getText().isEmpty() || txtAddress.getText().isEmpty() || txtPhone.getText().isEmpty() ){
                throw new Exception("Vui long nhap du lieu");
            }
            thuvien.thanhvien.ListController.list.add(new Thanhvien(txtCode.getText(), txtName.getText(), txtAddress.getText(),txtPhone.getText()));
            goToList(null);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }



    public void goToList(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/thanhvien/listthanhvien.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("menu");
        Main.rootStage.setScene(listScene);
    }

}
