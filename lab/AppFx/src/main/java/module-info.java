/* doesn't work with source level 1.8:
module com.mycompany.appfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.appfx to javafx.fxml;
    exports com.mycompany.appfx;
}
*/
