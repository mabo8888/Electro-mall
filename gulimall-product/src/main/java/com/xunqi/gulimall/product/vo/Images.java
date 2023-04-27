/** Copyright 2020 bejson.com */
package com.xunqi.gulimall.product.vo;

import lombok.Data;

/**
 * Auto-generated: 2020-05-31 11:3:26
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */

@Data
public class Images {

  private String imgUrl;
  private int defaultImg;

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public int getDefaultImg() {
    return defaultImg;
  }

  public void setDefaultImg(int defaultImg) {
    this.defaultImg = defaultImg;
  }
}
