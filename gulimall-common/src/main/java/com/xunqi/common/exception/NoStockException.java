package com.xunqi.common.exception;

import lombok.Getter;
import lombok.Setter;

public class NoStockException extends RuntimeException
{

    @Getter
    @Setter
    private Long SkuId;

    public NoStockException(Long SkuId) {
        super(SkuId + ":没有足够的库存");
    }

    public NoStockException(String msg1) {
        super(msg1);
    }
}
