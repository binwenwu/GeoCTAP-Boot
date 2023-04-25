package com.gis.geoctap.moudle01.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 *
 *
 * @author wubinwen
 * @email ${email}
 * @date 2023-04-25 14:15:49
 */
@Data
@TableName("children_info")
public class ChildrenInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	@TableId
	private Integer id;
	/**
	 *
	 */
	private String childName;
	/**
	 *
	 */
	private String sex;
	/**
	 *
	 */
	private Date registerTime;
	/**
	 *
	 */
	private Date birthday;
	/**
	 *
	 */
	private String volunteer;
	/**
	 *
	 */
	private String anotherInfo;
	/**
	 *
	 */
	private String place;
	/**
	 *
	 */
	private String disappearancePlace;
	/**
	 *
	 */
	private String disappearanceType;
	/**
	 *
	 */
	private Date disappearanceTime;
	/**
	 *
	 */
	private Integer height;
	/**
	 *
	 */
	private String feature;
	/**
	 *
	 */
	private String photo;
	/**
	 *
	 */
	private String disappearanceProvince;
	/**
	 *
	 */
	private String disappearanceCity;
	/**
	 *
	 */
	private String disappearanceDistrict;
	/**
	 *
	 */
	private Double disappearanceLongitude;
	/**
	 *
	 */
	private Double disappearanceLatitude;
	/**
	 *
	 */
	private String nowProvince;
	/**
	 *
	 */
	private String nowCity;
	/**
	 *
	 */
	private String nowDistrict;
	/**
	 *
	 */
	private Double nowLongitude;
	/**
	 *
	 */
	private Double nowLatitude;

}
