package com.Devarakonda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Devarakonda.entity.Users;
@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
