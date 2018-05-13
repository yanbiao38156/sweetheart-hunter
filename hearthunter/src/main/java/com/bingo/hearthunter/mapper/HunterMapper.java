package com.bingo.hearthunter.mapper;

import com.bingo.hearthunter.domain.Hunters;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by yanbiao on 2017/10/10.
 */
@Mapper
public interface HunterMapper {
    @Select("SELECT * FROM HUNTERS WHERE NICKNAME = #{nickname}")
    Hunters findByNickname(@Param("nickname") String nickname);
    @Insert("INSERT INTO HUNTERS(NICKNAME, AGE) VALUES(#{nickname}, #{age})")
    int insert(@Param("nickname") String nickname, @Param("age")Integer age);
}
