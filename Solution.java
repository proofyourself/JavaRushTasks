package packageTest.MVC_REAL;


import packageTest.MVC_REAL.controller.Controller;
import packageTest.MVC_REAL.model.MainModel;
import packageTest.MVC_REAL.model.Model;
import packageTest.MVC_REAL.view.EditUserView;
import packageTest.MVC_REAL.view.UsersView;

public class Solution {
    public static void main(String[] args) {

        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        //emulate user events
        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("NewName", 126L, 73);
        usersView.fireEventShowDeletedUsers();



    }
}
