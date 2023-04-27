package com.xunqi.gulimall.order.vo;

import com.xunqi.gulimall.order.entity.OrderEntity;
import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-07-04 22:34
 **/

@Data
public class SubmitOrderResponseVo {

    private OrderEntity order;

    public OrderEntity getOrder() {
        return order;
    }

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    /** 错误状态码 **/
    private Integer code;


}
