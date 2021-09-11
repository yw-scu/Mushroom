package com.yw.mushmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yw.common.utils.PageUtils;
import com.yw.mushmall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * skuÐÅÏ¢
 *
 * @author yw
 * @email yiwscu@outlook.com
 * @date 2021-09-01 23:34:50
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

