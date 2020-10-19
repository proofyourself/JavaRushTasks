package packageTest.MVC_REAL.model;



import packageTest.MVC_REAL.been.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class FakeModel implements Model  {


    private ModelData modelData = new ModelData();

    @Override
    public ModelData getModelData() {
        return modelData;
    }

    @Override
    public void loadUsers()  {

        List<User> users = new ArrayList<>();

        users.add(new User("Name1" , 1l , 1));
        users.add(new User("Name2" , 2l , 1));

        modelData.setUsers(users);

    }


    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }


    public void loadUserById(long userId) {

        throw new UnsupportedOperationException();

    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }


    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }

}

