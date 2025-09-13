package net.blf2.example.controller;

import jakarta.annotation.Resource;
import net.blf2.example.constants.Result;
import net.blf2.example.entity.UserInfo;
import net.blf2.example.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/all")
    public Result<List<UserInfo>> userAll(){
        return Result.success(userInfoService.getAllUserInfo());
    }
}
