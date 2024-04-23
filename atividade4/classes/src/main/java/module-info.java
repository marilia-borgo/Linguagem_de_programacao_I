module forms {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens forms to javafx.fxml;
    exports forms;
}
