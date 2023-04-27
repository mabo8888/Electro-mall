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
public class BaseAttrs {

  private Long attrId;
  private String attrValues;
  private int showDesc;

  public Long getAttrId() {
    return attrId;
  }

  public void setAttrId(Long attrId) {
    this.attrId = attrId;
  }

  public String getAttrValues() {
    return attrValues;
  }

  public void setAttrValues(String attrValues) {
    this.attrValues = attrValues;
  }

  public int getShowDesc() {
    return showDesc;
  }

  public void setShowDesc(int showDesc) {
    this.showDesc = showDesc;
  }
}
