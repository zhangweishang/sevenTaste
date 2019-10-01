package com.sise.service.impl;

import com.sise.entity.ProductInfo;
import com.sise.mapper.ProductInfoMapper;
import com.sise.service.IProductInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息表 服务实现类
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
@Service
public class ProductInfoServiceImpl extends ServiceImpl<ProductInfoMapper, ProductInfo> implements IProductInfoService {

}
