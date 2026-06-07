module nq.chessgame.chessfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens nq.chessgame.application to javafx.fxml;
    exports nq.chessgame.application;
}