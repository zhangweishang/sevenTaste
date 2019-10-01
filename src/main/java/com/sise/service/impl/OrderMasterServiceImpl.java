package com.sise.service.impl;

import com.sise.entity.OrderMaster;
import com.sise.mapper.OrderMasterMapper;
import com.sise.service.IOrderMasterService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单主表 服务实现类
 * </p>
 *
 * @author zj
 * @since 2019-10-01
 */
@Service
public class OrderMasterServiceImpl extends ServiceImpl<OrderMasterMapper, OrderMaster> implements IOrderMasterService {

}
