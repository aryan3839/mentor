package com.example.demo.mapper;

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
