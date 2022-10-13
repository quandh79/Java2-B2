package thuvien.thanhvien;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import thuvien.Main;
import thuvien.book.Book;
import thuvien.book.ListController;

public class FormController {
    public TextField txtCode;
    public TextField txtName;
    public TextField txtAddress;
     public TextField txtPhone;






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
