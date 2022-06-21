package com.flock.provincias.services;

import com.flock.provincias.models.JwtRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@ExtendWith(MockitoExtension.class)
public class UserDetailsServiceTest {

    @InjectMocks
    private JwtUserDetailsService service;

    @Test
    void loadUserOk(){
        String userName = "flock";
        UserDetails userDetails = service.loadUserByUsername(userName);
        Assertions.assertEquals(userDetails.getUsername(),userName);
        Assertions.assertNotNull(userDetails.getPassword());
    }

    @Test
    void loadUserNotOk(){
        String userName = "flockWrong";
        Assertions.assertThrows(UsernameNotFoundException.class, () -> service.loadUserByUsername(userName));
    }
}
