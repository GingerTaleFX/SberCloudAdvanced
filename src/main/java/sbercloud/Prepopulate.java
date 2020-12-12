package sbercloud;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import sbercloud.models.User;
import sbercloud.models.UserRepository;

@Component
@RequiredArgsConstructor
public class Prepopulate implements ApplicationRunner {
    private final UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        User lliza = new User("lliza", passwordEncoder.encode("123"));
        lliza.setLevel(9.0);
        userRepository.save(lliza);
    }
}
