module ranasiac.classwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens ranasiac.classwork to javafx.fxml;
    exports ranasiac.classwork;
}