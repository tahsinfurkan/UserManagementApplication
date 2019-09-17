package java.com.tahsinfurkan.usermanagement.repository;


import org.springframework.data.repository.CrudRepository;

import java.com.tahsinfurkan.usermanagement.model.User;

public interface UserRepository extends CrudRepository<User, String> {
}
