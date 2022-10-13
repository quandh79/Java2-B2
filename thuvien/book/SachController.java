package thuvien.book;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import thuvien.Main;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

public class SachController  {
    public TextField txtMaSach;
    public TextField txtTenSach;
    public TextField txtTheLoai;
     public TextField txtSoLuong;






    public void submit(javafx.event.ActionEvent actionEvent){
         try {
             int sl = Integer.parseInt(txtSoLuong.getText());
             if (txtMaSach.getText().isEmpty() || txtTenSach.getText().isEmpty() || txtTheLoai.getText().isEmpty() || sl <0 ){
                 throw new Exception("Vui long nhap du lieu");
             }
            thuvien.book.ListController.list.add(new Book(txtMaSach.getText(), txtTenSach.getText(), txtTheLoai.getText(),sl));
             goToList(null);
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
     }



    public void goToList(javafx.event.ActionEvent actionEvent) throws Exception{
        Parent listPage = FXMLLoader.load(getClass().getResource("/thuvien/book/listsach.fxml"));
        Scene listScene = new Scene(listPage,800,600);

        Main.rootStage.setTitle("menu");
        Main.rootStage.setScene(listScene);
    }


}
