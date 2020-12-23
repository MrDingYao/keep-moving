package com.santu.auth.dto;

import com.santu.auth.entity.User;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author santu
 * @date 2020/12/16 22:00
 */
@Data
@Accessors(chain = true)
public class UserDto extends User {

    private String code;

    private String uuid;

    private String token;
}
