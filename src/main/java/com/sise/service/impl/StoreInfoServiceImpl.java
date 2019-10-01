package com.sise.service.impl;

import com.sise.entity.StoreInfo;
import com.sise.mapper.StoreInfoMapper;
import com.sise.service.IStoreInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商铺信息表 服务实现类
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
@Service
public class StoreInfoServiceImpl extends ServiceImpl<StoreInfoMapper, StoreInfo> implements IStoreInfoService {

}
