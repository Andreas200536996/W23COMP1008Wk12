package com.example.w23comp1008wk12;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ClassViewController implements Initializable {

    @FXML
    private Label ageLabel;

    @FXML
    private ListView<Student> listView;

    @FXML
    private Label nameLabel;

    @FXML
    private Label stNumLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<Student> students = new ArrayList<>();
        Student homer = new Student("Homer", 20023, LocalDate.of(1965,05,12));
        Student marge = new Student("Marge", 20302, LocalDate.of(1977,04,12));
        Student bart = new Student("Bart", 12342, LocalDate.of(1985,06,15));
        students.add(homer);
        students.add(marge);
        students.add(bart);

        listView.getItems().addAll(students);

        //create a listener to observe when a user clicks on an item in the listview
        listView.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, studentSelected) -> {
            nameLabel.setText("Name: " + studentSelected.getName());
            stNumLabel.setText("St #: " + studentSelected.getStudentNum());
            ageLabel.setText("Age: " + studentSelected.getAge() + " year");

        });

    }
}