module forms {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    opens forms to javafx.fxml;
    exports forms;
}
