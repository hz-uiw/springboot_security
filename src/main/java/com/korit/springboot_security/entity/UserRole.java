package com.korit.springboot_security.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRole {
    private int userRoleId;
    private int userId;
    private int roleId;

    private Role role;
}
