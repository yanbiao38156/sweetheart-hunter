package com.bingo.hearthunter.service;

import com.bingo.hearthunter.domain.Users;

/**
 * Created by yanbiao on 2017/10/10.
 */
public interface UserService {
    String add(Users user);

    String update(Users user);
}
