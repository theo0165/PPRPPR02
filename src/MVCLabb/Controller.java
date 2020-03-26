package MVCLabb;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

public class Controller {
    double size = 18;

    @FXML
    Canvas _canvas;

    @FXML
    ColorPicker _colorPicker;

    @FXML
    TextField _sizePicker;

    public void initialize() {
        _sizePicker.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    _sizePicker.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });

        GraphicsContext graphicsContext = _canvas.getGraphicsContext2D();
        _canvas.setOnMouseDragged(event -> {
            double x = event.getX() - size / 2;
            double y = event.getY() - size / 2;

            graphicsContext.setFill(_colorPicker.getValue());
            graphicsContext.fillOval(x, y, size, size);
        });
    }

    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void changeSize(ActionEvent actionEvent) {
        size = Double.valueOf(_sizePicker.getText());
        initialize();
    }
}
