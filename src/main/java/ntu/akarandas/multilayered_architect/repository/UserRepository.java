package ntu.akarandas.multilayered_architect.repository;

import ntu.akarandas.multilayered_architect.model.User;
import org.springframework.stereotype.Component;


@Component
public class UserRepository {

    public User getDefaultUser() {
        return new User("Andriy", "Karandas");
    }
}
