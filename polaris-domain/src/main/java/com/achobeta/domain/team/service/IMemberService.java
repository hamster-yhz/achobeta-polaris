package com.achobeta.domain.team.service;

import com.achobeta.domain.user.model.entity.UserEntity;

import java.util.List;

/**
 * @author yangzhiyao
 * @description 成员服务接口
 * @date 2024/11/17
 */
public interface IMemberService {

    /**
     * 查看团队成员列表
     * @param teamId 团队ID
     * @param lastId 上次查询的最后一条记录ID
     * @param limit 单次查询一页的记录数
     * @return 成员列表
     */
    List<UserEntity> queryMembers(String teamId,String lastId, Integer limit);

}