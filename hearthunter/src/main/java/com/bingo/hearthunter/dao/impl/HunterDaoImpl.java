package com.bingo.hearthunter.dao.impl;

import com.bingo.hearthunter.dao.HunterDao;
import com.bingo.hearthunter.domain.Hunters;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by yanbiao on 2017/10/10.
 */
@Repository("hunterDao")
public class HunterDaoImpl implements HunterDao{

    @Override
    public Hunters queryById(int id){
        return null;
    }

    @Override
    public List<Hunters> queryByUserId(String userId){
        return null;
    }

    @Override
    public List<Hunters> queryByFields(Hunters hunter){
        return null;
    }

    @Override
    public int add(Hunters hunter){
        return 0;
    }

    @Override
    public int update(Hunters hunter){
        return 0;
    }

    @Override
    public int delete(Hunters hunter){
        return 0;
    }
}
