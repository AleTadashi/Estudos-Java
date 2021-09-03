package com.PrimeiroProjetoJava.PrimeiroProjetoJava.repository;

import com.PrimeiroProjetoJava.PrimeiroProjetoJava.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
