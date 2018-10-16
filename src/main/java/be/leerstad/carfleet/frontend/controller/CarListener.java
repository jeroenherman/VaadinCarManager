package be.leerstad.carfleet.frontend.controller;


import be.leerstad.carfleet.frontend.InputPanel;
import be.leerstad.carfleet.service.manager.CarManager;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;

public class CarListener implements ClickListener {
   private CarManager manager;
   private InputPanel inputPanel;

    public CarListener(InputPanel inputPanel, CarManager manager) {
        this.inputPanel = inputPanel;
        this.manager = manager;
    }

    @Override
    public void buttonClick(Button.ClickEvent event) {

    }
}
