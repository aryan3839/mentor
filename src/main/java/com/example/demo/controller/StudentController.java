package com.example.demo.controller;

import com.example.demo.dto.ResponseDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.IStudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController {

    private IStudentService iStudentService;



    @PostMapping("/create")
    public ResponseEntity<ResponseDto>createUsers(@RequestBody UserDto userDto,@RequestParam String role){
        iStudentService.createUser(userDto,role);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("Successfully created",HttpStatus.CREATED));
    }


    @GetMapping("/fetch")
    public ResponseEntity<UserDto>fetchStudentDetails(@RequestParam String email){
        UserDto userDto=iStudentService.fetchDetails(email);
        return ResponseEntity.status(HttpStatus.OK)
                .body(userDto);
    }

    @GetMapping("/role/{role}")
    public ResponseEntity<List<UserDto>>fetchRole(@PathVariable String role){
        List<UserDto> users = iStudentService.fetchDetailsByRole(role);
        return ResponseEntity.ok(users);

    }


    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto>deleteUser(@RequestParam String email){
        boolean isDeleted=iStudentService.deleteUser(email);
        if(isDeleted){
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto("Deleted Successfully",HttpStatus.OK));
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ResponseDto("Unable To Delete",HttpStatus.BAD_REQUEST));
        }
    }
}
