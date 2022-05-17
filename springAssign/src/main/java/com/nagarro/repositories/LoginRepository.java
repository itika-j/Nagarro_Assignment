package com.nagarro.repositories;

import com.nagarro.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<User, String> {
    User findByUsernameAndPassword(String username, String password);
}
