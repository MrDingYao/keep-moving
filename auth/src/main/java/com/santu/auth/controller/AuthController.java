package com.santu.auth.controller;

import com.santu.auth.dto.UserDto;
import com.santu.auth.entity.User;
import com.santu.common.response.Response;
import org.springframework.web.bind.annotation.*;

/**
 * @author santu
 * @date 2020/12/15 22:30
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public Response<UserDto> login(@RequestBody User user) {
        UserDto userDto = new UserDto();
        userDto.setUsername(user.getUsername());
        userDto.setToken("abcde");
        return Response.ok(userDto);
    }
}
