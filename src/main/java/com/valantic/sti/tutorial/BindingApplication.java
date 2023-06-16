package com.valantic.sti.tutorial;

import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BindingApplication extends Application {

    @Override
    public void start(final Stage stage) {
        final IntegerProperty x = new SimpleIntegerProperty(3);
        final IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));
        log.info("x={}, y={}", x.getValue(), y.getValue());

        x.setValue(9);
        log.info("x={}, y={}", x.getValue(), y.getValue());
    }

    public static void main(final String... args) {
        launch(args);
    }
}