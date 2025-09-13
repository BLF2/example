package net.blf2.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.blf2.example.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
