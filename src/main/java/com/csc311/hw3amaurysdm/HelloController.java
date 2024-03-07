package com.csc311.assignment3amaurysdm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Button addGradeButton;

    @FXML
    private TableColumn<?, ?> categoryColumn;

    @FXML
    private TextField lastActionTextField;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private TextField newChategoryTextField;

    @FXML
    private TextField newNameTextField;

    @FXML
    private TextField newScoreTextField;

    @FXML
    private TextField queueTextField;

    @FXML
    private TableColumn<?, ?> scoreColumn;

    @FXML
    private TableView<?> tableView;

    @FXML
    void clearQueue(ActionEvent event) {

    }

    @FXML
    void closeApplication(ActionEvent event) {

    }

    @FXML
    void openToNormalQueue(ActionEvent event) {

    }

    @FXML
    void openToPriorityQueue(ActionEvent event) {

    }

    @FXML
    void removeGrade(ActionEvent event) {

    }

    @FXML
    void saveToJSON(ActionEvent event) {

    }
}