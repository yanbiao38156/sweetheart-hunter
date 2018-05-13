package com.bingo.hearthunter;

import com.bingo.hearthunter.common.utils.StringUtil;
import com.bingo.hearthunter.domain.Users;
import com.bingo.hearthunter.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by yanbiao on 2017/10/13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = HearthunterApplication.class)
@Transactional
public class UserTests {

    @Autowired
    private UserMapper um;
    @Test
    @Rollback
    public void testUsersMapper() throws Exception {
        um.insert(StringUtil.getUUIDStr(),"yanbiao");
        Users u = um.findByNickname("yanbiao");
        System.out.println(u.getNickname());
    }
}