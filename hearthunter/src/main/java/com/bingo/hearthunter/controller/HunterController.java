package com.bingo.hearthunter.controller;

import com.bingo.hearthunter.domain.Hunters;
import com.bingo.hearthunter.domain.ResultJson;
import com.bingo.hearthunter.service.HunterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.List;

/**
 * Created by yanbiao on 2017/10/10.
 */
@RestController
public class HunterController {

    @Autowired
    private HunterService hunterService;

    /**
     * 若支付失败仍然插入记录
     * @param hunters
     * @return
     */
    @RequestMapping(value="/add")
    public ResultJson add(@ModelAttribute Hunters hunters){
        hunters.setCreatedTime(new Date());
        //hunters.setStatus(0);
        ResultJson<?> resultJson ;
        try{
            int id = hunterService.add(hunters);
            resultJson = new ResultJson(id);
        }catch (Throwable e){
            resultJson = new ResultJson(e);
        }
        return resultJson;
    }

    /**
     * 若支付成功，更新status为1
     * @param id
     */
    @RequestMapping(value="/update")
    public ResultJson update(@RequestParam("id") int id){
        Hunters hunter = hunterService.queryById(id);
        hunter.setStatus(1);
        ResultJson<?> resultJson ;
        try{
            int newId = hunterService.update(hunter);
            resultJson = new ResultJson(newId);
        }catch (Throwable e){
            resultJson = new ResultJson(e);
        }
        return resultJson;
    }

    /**
     * 查询自己查看过的人
     * @param userId
     * @return
     */
    @RequestMapping(value="/listHunters")
    public List<Hunters> queryHuntersByUserId(@RequestParam("userId") String userId){
        return hunterService.queryByUserId(userId);
    }

    /**
     * 删除
     */
    @RequestMapping(value="/delete")
    public int delete(@RequestParam("id") int id){
        Hunters hunter = hunterService.queryById(id);
        return hunterService.delete(hunter);
    }

    /**
     * 根据字段查询的通用方法
     */
    @RequestMapping(value="/queryByFields")
    public List<Hunters> queryByFields(@ModelAttribute Hunters hunter){
        return hunterService.queryByFields(hunter);
    }

}
