package org.linbo.demo.api.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * 用户信息
 * @author 71085
 *
 */
@Data
@TableName("user")
public class User {

	@TableId(type = IdType.AUTO)
	private Long id;
	
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	
	private Long gender;

}
