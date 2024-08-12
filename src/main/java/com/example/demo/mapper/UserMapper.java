package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;

public class UserMapper {
    public static User mapToUser(UserDto userDto,User user){
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        Role role=new Role();
        role.setRoleName(user.getRole().getRoleName());
        user.setRole(role);
        return user;
    }
    public static UserDto mapToUserDto(User user,UserDto userDto){
        userDto.setEmail(user.getEmail());
        userDto.setPassword(user.getPassword());
        userDto.setRole(user.getRole());
        return userDto;
    }

}
