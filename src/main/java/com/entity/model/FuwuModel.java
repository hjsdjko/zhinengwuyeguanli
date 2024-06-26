package com.entity.model;

import com.entity.FuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 服务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-29
 */
public class FuwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 服务名称
     */
    private String fuwuName;


    /**
     * 服务类型
     */
    private Integer fuwuTypes;


    /**
     * 服务详情
     */
    private String fuwuContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 是否同意
     */
    private Integer fuwuYesNoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：服务名称
	 */
    public String getFuwuName() {
        return fuwuName;
    }


    /**
	 * 设置：服务名称
	 */
    public void setFuwuName(String fuwuName) {
        this.fuwuName = fuwuName;
    }
    /**
	 * 获取：服务类型
	 */
    public Integer getFuwuTypes() {
        return fuwuTypes;
    }


    /**
	 * 设置：服务类型
	 */
    public void setFuwuTypes(Integer fuwuTypes) {
        this.fuwuTypes = fuwuTypes;
    }
    /**
	 * 获取：服务详情
	 */
    public String getFuwuContent() {
        return fuwuContent;
    }


    /**
	 * 设置：服务详情
	 */
    public void setFuwuContent(String fuwuContent) {
        this.fuwuContent = fuwuContent;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：是否同意
	 */
    public Integer getFuwuYesNoTypes() {
        return fuwuYesNoTypes;
    }


    /**
	 * 设置：是否同意
	 */
    public void setFuwuYesNoTypes(Integer fuwuYesNoTypes) {
        this.fuwuYesNoTypes = fuwuYesNoTypes;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
