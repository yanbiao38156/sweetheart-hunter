package com.bingo.hearthunter.dao;

import com.bingo.hearthunter.domain.Hunters;

import java.util.List;

/**
 * Created by yanbiao on 2017/10/10.
 */
public interface HunterDao {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Hunters queryById(int id);

    /**
     * 根据userId查询
     * @param userId
     * @return
     */
    List<Hunters> queryByUserId(String userId);

    /**
     * @param hunter
     * 根据字段查询通用方法
     */
    List<Hunters> queryByFields(Hunters hunter);

    /**
     * 增
     * @param hunter
     * @return
     */
    int add(Hunters hunter);

    /**
     * 改
     * @param hunter
     * @return
     */

    int update(Hunters hunter);

    /**
     * 删
     * @param hunter
     * @return
     */

    int delete(Hunters hunter);

}
