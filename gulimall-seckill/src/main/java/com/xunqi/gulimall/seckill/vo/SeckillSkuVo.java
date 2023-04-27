package com.xunqi.gulimall.seckill.vo;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class SeckillSkuVo {

    private Long id;
    /**
     * 活动id
     */
    private Long promotionId;
    /**
     * 活动场次id
     */
    private Long promotionSessionId;
    /**
     * 商品id
     */
    private Long skuId;
    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;
    /**
     * 秒杀总量
     */
    private Integer seckillCount;
    /**
     * 每人限购数量
     */
    private Integer seckillLimit;
    /**
     * 排序
     */
    private Integer seckillSort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }

    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }

    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }

    public Integer getSeckillCount() {
        return seckillCount;
    }

    public void setSeckillCount(Integer seckillCount) {
        this.seckillCount = seckillCount;
    }

    public Integer getSeckillLimit() {
        return seckillLimit;
    }

    public void setSeckillLimit(Integer seckillLimit) {
        this.seckillLimit = seckillLimit;
    }

    public Integer getSeckillSort() {
        return seckillSort;
    }

    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }
}
