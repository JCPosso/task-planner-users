package edu.eci.ieti.Users.service;

import edu.eci.ieti.Users.data.User;
import edu.eci.ieti.Users.dto.UserDto;

import java.util.Date;
import java.util.List;

public interface UserService
{
    User create(User user );

    User findById( String id );

    List<User> getAll();

    void deleteById( String id );

    void update(UserDto userDto, String id);

    List<User> findUsersWithNameOrLastNameLike(String queryText);

    List<User> findUsersCreatedAfter(Date startDate);

    User findByEmail(String email);
}