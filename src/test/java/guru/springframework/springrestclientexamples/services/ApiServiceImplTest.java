package guru.springframework.springrestclientexamples.services;

import guru.springframework.api.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Eduardo on 06/01/18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testGetUser() throws Exception {

       List<User> users =  apiService.getUsers(3);

        assertEquals(4,users.size());
    }
}