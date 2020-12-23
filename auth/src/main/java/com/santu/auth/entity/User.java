package com.santu.auth.entity;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author santu
 * @date 2020/12/16 21:59
 */
@Data
@Accessors(chain = true)
public class User {

    private Integer id;

    private String username;

    private String password;
}
