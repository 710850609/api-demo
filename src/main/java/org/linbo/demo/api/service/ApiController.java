package org.linbo.demo.api.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.linbo.demo.api.mapper.UserMapper;
import org.linbo.demo.api.model.User;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/users")
public class ApiController {
	
	@Resource
	private UserMapper userMapper;

	@GetMapping("")
	public IPage<User> list(User params,
                            @RequestParam(name = "pageNo", defaultValue = "1")Integer pageNo,
                            @RequestParam(name = "pageSize", defaultValue = "10") Integer pageSize) {
	    if (StringUtils.isEmpty(params.getName())) {
	        params.setName(null);
        }
        Wrapper<User> queryWrapper = new QueryWrapper<>(params);
        Page<User> page = new Page<>(pageNo, pageSize);
        IPage<User> pageData = userMapper.selectPage(page, queryWrapper);
        if (pageData.getTotal() == 0) {
            Long total = Long.parseLong(userMapper.selectCount(queryWrapper).toString());
            pageData.setTotal(total);
        }
        return pageData;
    }
	
	@GetMapping("{id}")
	public User getById(@PathVariable Long id) {
		User user = userMapper.selectById(id);
		return user;
	}
	
	@PostMapping("")
	public void add(@RequestBody User user) {
		user.setId(null);
	    userMapper.insert(user);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Long id, @RequestBody User user) {
		Assert.isTrue(id != null, "更新id为空");
		user.setId(id);
		userMapper.updateById(user);
	}

	@DeleteMapping("/{id}") 
	public void delete(@PathVariable Long id) {
		Assert.isTrue(id != null, "删除id为空");
		userMapper.deleteById(id);
	}
	
}
