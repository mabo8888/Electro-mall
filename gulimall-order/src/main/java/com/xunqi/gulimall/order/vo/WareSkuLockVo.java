package com.xunqi.gulimall.order.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description: 锁定库存的vo
 * @Created: with IntelliJ IDEA.
 **/

@Data
public class WareSkuLockVo {

    private String orderSn;

    /** 需要锁住的所有库存信息 **/
    private List<OrderItemVo> locks;

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public List<OrderItemVo> getLocks() {
        return locks;
    }

    public void setLocks(List<OrderItemVo> locks) {
        this.locks = locks;
    }
}
