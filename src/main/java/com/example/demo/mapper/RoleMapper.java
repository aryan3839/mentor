package com.example.demo.mapper;

import com.example.demo.dto.RoleDto;
import com.example.demo.entity.Role;

public class RoleMapper {
    public static Role mapToRole(RoleDto roleDto,Role role){
        role.setRoleName(roleDto.getRoleName());
        return role;
    }
    public static RoleDto mapToRoleDto(Role role,RoleDto roleDto){
        roleDto.setRoleName(role.getRoleName());
        return roleDto;
    }
}
