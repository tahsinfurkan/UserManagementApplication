package java.com.tahsinfurkan.usermanagement.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.com.tahsinfurkan.usermanagement.model.User;
import java.com.tahsinfurkan.usermanagement.repository.UserRepository;
import java.util.List;

@Service
@Slf4j
@ApplicationScoped
@ManagedBean(name = "userService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private String operationMessage = "";

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public void save(User user) {
        userRepository.save(user);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public void delete(User user) {
        userRepository.delete(user);
    }

    public String getOperationMessage() {
        return operationMessage;
    }

    public void setOperationMessage(String operationMessage) {
        this.operationMessage = operationMessage;
    }

}