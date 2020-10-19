package packageTest.MVC_REAL.view;


import packageTest.MVC_REAL.controller.Controller;
import packageTest.MVC_REAL.model.ModelData;

public interface View {

    void refresh(ModelData modelData);

    void setController(Controller controller);

}