package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;

import java.util.List;

/**
 * Created by Eduardo on 06/01/18.
 */
public interface ApiService {

    List<User> getUsers(Integer limit);
}
