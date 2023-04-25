package com.gis.geoctap.moudle01.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 *
 *
 * @author wubinwen
 * @email ${email}
 * @date 2023-04-25 14:15:49
 */
@Data
@TableName("user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private String username;
	/**
	 *
	 */
	private String password;
	/**
	 *
	 */
	private String sex;
	/**
	 *
	 */
	private String telephone;
	/**
	 *
	 */
	private String address;
	/**
	 *
	 */
	private Integer age;
	/**
	 *
	 */
	private Integer volunteer;
	/**
	 *
	 */
	private String role;

}
