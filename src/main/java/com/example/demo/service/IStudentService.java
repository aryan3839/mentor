package com.example.demo.service;

import com.example.demo.dto.UserDto;

import java.util.List;

public interface IStudentService {
    void createUser(UserDto userDto,String role);
    UserDto fetchDetails(String email);
    List<UserDto> fetchDetailsByRole(String role);
    boolean deleteUser(String email);
}
