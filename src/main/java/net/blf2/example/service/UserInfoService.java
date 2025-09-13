package net.blf2.example.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.blf2.example.entity.UserInfo;
import net.blf2.example.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoService extends ServiceImpl<UserInfoMapper, UserInfo> {


    public List<UserInfo> getAllUserInfo(){

        return this.list();
    }
}
