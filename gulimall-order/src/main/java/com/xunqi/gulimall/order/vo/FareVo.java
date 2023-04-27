package com.xunqi.gulimall.order.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 **/

@Data
public class FareVo {

    private MemberAddressVo address;

    private BigDecimal fare;

    public MemberAddressVo getAddress() {
        return address;
    }

    public void setAddress(MemberAddressVo address) {
        this.address = address;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }
}
