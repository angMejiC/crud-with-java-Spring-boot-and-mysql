package com.api.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.Models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

    
 
}
