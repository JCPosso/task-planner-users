package edu.eci.ieti.Users.repository;

import edu.eci.ieti.Users.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<User, String>
{
    List<User> findByName(String queryText);

    List<User> findByLastName(String queryText);

    List<User> findBycreatedAtAfter(Date startDate);

    User findByEmail(String email);
}