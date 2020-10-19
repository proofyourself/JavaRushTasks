package packageTest.MVC_REAL.view;


import packageTest.MVC_REAL.been.User;
import packageTest.MVC_REAL.controller.Controller;
import packageTest.MVC_REAL.model.ModelData;

public class UsersView implements View{

    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {

        System.out.println("All " + (modelData.isDisplayDeletedUserList() ? "deleted " : "") + "users:");

        for(User user : modelData.getUsers()){

            System.out.println("\t" + user);

        }

        System.out.println("===================================================");

    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers(){

        controller.onShowAllUsers();

    }

    public void fireEventShowDeletedUsers(){

        controller.onShowAllDeletedUsers();

    }

    public void fireEventOpenUserEditForm(long id) {

        controller.onOpenUserEditForm(id);

    }
}
