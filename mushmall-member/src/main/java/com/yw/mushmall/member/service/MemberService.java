package com.yw.mushmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yw.common.utils.PageUtils;
import com.yw.mushmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * »áÔ±
 *
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:40:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

