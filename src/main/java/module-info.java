module com.eva.f1cc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.eva.f1cc to javafx.fxml;
    exports com.eva.f1cc;
}