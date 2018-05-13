package com.bingo.hearthunter.service.impl;

import com.bingo.hearthunter.dao.HunterDao;
import com.bingo.hearthunter.domain.Hunters;
import com.bingo.hearthunter.service.HunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yanbiao on 2017/10/10.
 */
@Service("hunterService")
public class HunterServiceImpl implements HunterService {

    @Autowired
    private HunterDao hunterDao;

    @Override
    public List<Hunters> queryByUserId(String userId){
        return hunterDao.queryByUserId(userId);
    }

    @Override
    public Hunters queryById(int id){
        return hunterDao.queryById(id);
    }

    @Override
    public List<Hunters> queryByFields(Hunters hunter){
        return hunterDao.queryByFields(hunter);
    }

    @Override
    public int add(Hunters hunter){
        return hunterDao.add(hunter);
    }

    @Override
    public int update(Hunters hunter){
        return hunterDao.update(hunter);
    }

    @Override
    public int delete(Hunters hunter){
        return hunterDao.delete(hunter);
    }
}
