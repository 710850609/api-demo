package org.linbo.demo.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.linbo.demo.api.dto.UserDto;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<UserDto> {

    public List<Map<String, String>> getTest();
}
