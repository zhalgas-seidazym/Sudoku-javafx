module amyk.sudoku {
    requires javafx.controls;
    requires javafx.fxml;


    opens amyk.sudoku to javafx.fxml;
    exports amyk.sudoku;
}