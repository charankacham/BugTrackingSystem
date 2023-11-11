package com.bugtrackingsystem.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bugtrackingsystem.dto.BasicDTO;
import com.bugtrackingsystem.dto.UserDTO;
import com.bugtrackingsystem.enums.UserRoleEnum;
import com.bugtrackingsystem.implementation.IUserServiceImplementation;
import com.bugtrackingsystem.models.User;
import java.util.List;
@RestController
@CrossOrigin

@RequestMapping("/api/user")
public class UserController {
    @Autowired
    IUserServiceImplementation iUserServiceImplementation;

    @PostMapping("/register")
    public ResponseEntity<BasicDTO<User>> register(@RequestBody UserDTO user){
        return new ResponseEntity<>(new BasicDTO<>(iUserServiceImplementation.registerUser(user.toUserObject())), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<BasicDTO<User>> login(@RequestBody UserDTO user){
        return ResponseEntity.ok(new BasicDTO<>(iUserServiceImplementation.signIn(user.toUserObject())));
    }
    @GetMapping("/otherUsers/{userId}")
    public ResponseEntity<BasicDTO<List<User>>> otherUsers(@PathVariable("userId") Long userId){
        return ResponseEntity.ok(new BasicDTO<>(iUserServiceImplementation.findOtherUsers(userId)));
    }
    @GetMapping("/allByRole/{role}")
    public ResponseEntity<BasicDTO<List<User>>> findAllByRole(@PathVariable("role") UserRoleEnum role){
        return ResponseEntity.ok(new BasicDTO<>(iUserServiceImplementation.findAllByRole(role)));
    }
    @GetMapping("/allUsers")
    public ResponseEntity<BasicDTO<List<User>>> findAllUsers(){
        return ResponseEntity.ok(new BasicDTO<>(iUserServiceImplementation.findAll()));
    }
    @GetMapping("/test")
    public @ResponseBody String greeting() {
        return iUserServiceImplementation.greet();
    }
}
