package com.xunqi.gulimall.cart.to;

import lombok.Data;

/**
 * @Description:
 * @Created: with IntelliJ IDEA.
 **/

@Data
public class UserInfoTo {

    private Long userId;

    private String userKey;

    /**
     * 是否临时用户
     */
    private Boolean tempUser = false;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public Boolean getTempUser() {
        return tempUser;
    }

    public void setTempUser(Boolean tempUser) {
        this.tempUser = tempUser;
    }
}
