package com.hooper.dto.input;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * Created by hooper on 2016/12/1.
 */
public class UserInput {

    @NotEmpty(message = "message test")
    private String name;

    private String avatar;

    @NotEmpty(message = "new message")
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
