package org.linbo.demo.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.linbo.demo.api.model.User;

import java.util.List;
import java.util.Map;

public interface UserMapper extends BaseMapper<User> {

    List<Map<String, String>> getTest();
}
