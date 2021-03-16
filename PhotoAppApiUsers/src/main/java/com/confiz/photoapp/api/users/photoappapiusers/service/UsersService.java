package com.confiz.photoapp.api.users.photoappapiusers.service;

import com.confiz.photoapp.api.users.photoappapiusers.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {

    UserDto createUser(UserDto userDetails);

    UserDto getUserDetailsByEmail(String email);

    UserDto getUserByUserId(String userId);
}
