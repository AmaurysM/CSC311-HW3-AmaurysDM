module com.csc311.assignment3amaurysdm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.csc311.hw3amaurysdm to javafx.fxml;
    exports com.csc311.hw3amaurysdm;
}