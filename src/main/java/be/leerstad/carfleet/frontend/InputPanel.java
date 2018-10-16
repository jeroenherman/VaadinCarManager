package be.leerstad.carfleet.frontend;

import be.leerstad.carfleet.service.dto.CarDTO;
import be.leerstad.carfleet.service.manager.BrandManager;
import be.leerstad.carfleet.service.manager.CarManager;
import com.vaadin.ui.*;

import java.util.Observable;
import java.util.Observer;

public class InputPanel extends VerticalLayout implements Observer {

    private CarManager carManager;
    private BrandManager brandManager;
    private ListSelect<CarDTO> selectCar;
    private ComboBox brands;

    public InputPanel(CarManager carManager, BrandManager brandManager) {
        this.carManager = carManager;
        this.brandManager = brandManager;
        init();
    }

    private void init() {
        carManager.addObserver(this);
        createInput();
    }

    private void createInput() {
        selectCar = new ListSelect<CarDTO>(carManager.getBrands());
        ops = new ComboBox();

        HorizontalLayout layout = new HorizontalLayout();
        layout.setMargin(true);
        layout.addComponent(input1);
        layout.addComponent(ops);
        layout.addComponent(input2);

        addComponent(layout);
    }


    @Override
    public void update(Observable o, Object arg) {
        input1.clear();
        input2.clear();
        ops.clear();
    }

    public TextField getInput1() {
        return input1;
    }

    public TextField getInput2() {
        return input2;
    }

    public ComboBox getOps() {
        return ops;
    }
}
