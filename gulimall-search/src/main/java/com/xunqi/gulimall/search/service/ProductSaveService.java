package com.xunqi.gulimall.search.service;

import com.xunqi.common.es.MySkuEsModel;

import java.io.IOException;
import java.util.List;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-06-06 16:53
 **/
public interface ProductSaveService {

    boolean productStatusUp(List<MySkuEsModel> skuEsModels) throws IOException;
}
