package java.com.tahsinfurkan.usermanagement.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.validation.Valid;
import java.com.tahsinfurkan.usermanagement.model.User;
import java.com.tahsinfurkan.usermanagement.service.UserService;
import java.util.List;

@ManagedBean(name = "userController")
@SessionScoped
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    public List<User> allUsers() {
        return userService.getAll();
    }

    public ResponseEntity<Object> createUser(@Valid User user) {
        System.out.println("saving..." + user.getFirstName() + user.getLastName() + user.getPhoneNum());
        userService.save(user);
        return successMessageResponse("User Saving");
    }

    public ResponseEntity<Object> updateUser(@Valid User user) {
        userService.update(user);
        return successMessageResponse("User Updating");
    }

    public ResponseEntity<Object> deleteUser(User user) {
        userService.delete(user);
        return successMessageResponse("User Deleting");
    }

}






