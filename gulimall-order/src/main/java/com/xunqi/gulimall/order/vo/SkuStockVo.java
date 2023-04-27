package com.xunqi.gulimall.order.vo;

import lombok.Data;

/**
 * @Description: 库存vo
 **/

@Data
public class SkuStockVo {


    private Long skuId;

    private Boolean hasStock;

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public Boolean getHasStock() {
        return hasStock;
    }

    public void setHasStock(Boolean hasStock) {
        this.hasStock = hasStock;
    }
}
