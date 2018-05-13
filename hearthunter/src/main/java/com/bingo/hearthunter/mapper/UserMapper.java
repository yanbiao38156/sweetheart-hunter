package com.bingo.hearthunter.mapper;


import com.bingo.hearthunter.domain.Users;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * Created by yanbiao on 2017/10/10.
 */

public interface UserMapper {

    // (Author) selectOne("selectAuthor",5);
    Users select(int id);
    // (List<Users>) selectList(“selectAuthors”)
    List<Users> listUsers();
    // (Map<Integer,Author>) selectMap("selectAuthors", "id")
    @MapKey("id")
    Map<Integer, Users> selectAuthors();
    // insert("insertAuthor", author)
    int insert(Users user);
    // updateAuthor("updateAuthor", author)
    int update(Users user);
    // delete("deleteAuthor",5)
    int delete(int id);

}