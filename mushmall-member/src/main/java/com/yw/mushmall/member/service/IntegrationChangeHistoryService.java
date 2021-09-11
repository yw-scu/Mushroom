package com.yw.mushmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yw.common.utils.PageUtils;
import com.yw.mushmall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * »ý·Ö±ä»¯ÀúÊ·¼ÇÂ¼
 *
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:40:11
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

