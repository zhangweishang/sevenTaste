package com.sise.service.impl;

import com.sise.entity.ProductType;
import com.sise.mapper.ProductTypeMapper;
import com.sise.service.IProductTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类型表 服务实现类
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
@Service
public class ProductTypeServiceImpl extends ServiceImpl<ProductTypeMapper, ProductType> implements IProductTypeService {

}
