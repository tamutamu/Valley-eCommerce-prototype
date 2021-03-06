package com.piper.valley.forms;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class PromoteAdminForm {
    @NotEmpty
    @Length(min = 3, max = 150)
    private String username;

    public PromoteAdminForm() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
