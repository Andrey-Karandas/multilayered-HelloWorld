package ntu.akarandas.multilayered_architect.service;

import lombok.AllArgsConstructor;
import ntu.akarandas.multilayered_architect.repository.UserRepository;
import ntu.akarandas.multilayered_architect.model.User;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class HomePageService {

    public static final String GREETINGS_FORMAT = 
    "Welcome to the Internet %s %s,\nhave a little fun.\nTime of last refresh:%s";
    private UserRepository userRepository;

    public String getHelloString() {
        User user = userRepository.getDefaultUser();
        return String.format(GREETINGS_FORMAT, user.getName(), user.getSurname(), LocalDateTime.now());
    }
}
