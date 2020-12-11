package sbercloud.services;

import sbercloud.models.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.lang.String.format;

@Service
@RequiredArgsConstructor
public class SCUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return Optional.ofNullable(userRepository.findByUsername(s)).orElseThrow(() -> {
            throw new UsernameNotFoundException(format("User %s not found\n", s));
        });
    }
}
