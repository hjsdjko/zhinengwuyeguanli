package com.entity.vo;

import com.entity.FuwuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 服务
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-29
 */
@TableName("fuwu")
public class FuwuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 服务名称
     */

    @TableField(value = "fuwu_name")
    private String fuwuName;


    /**
     * 服务类型
     */

    @TableField(value = "fuwu_types")
    private Integer fuwuTypes;


    /**
     * 服务详情
     */

    @TableField(value = "fuwu_content")
    private String fuwuContent;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 是否同意
     */

    @TableField(value = "fuwu_yes_no_types")
    private Integer fuwuYesNoTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：服务名称
	 */
    public String getFuwuName() {
        return fuwuName;
    }


    /**
	 * 获取：服务名称
	 */

    public void setFuwuName(String fuwuName) {
        this.fuwuName = fuwuName;
    }
    /**
	 * 设置：服务类型
	 */
    public Integer getFuwuTypes() {
        return fuwuTypes;
    }


    /**
	 * 获取：服务类型
	 */

    public void setFuwuTypes(Integer fuwuTypes) {
        this.fuwuTypes = fuwuTypes;
    }
    /**
	 * 设置：服务详情
	 */
    public String getFuwuContent() {
        return fuwuContent;
    }


    /**
	 * 获取：服务详情
	 */

    public void setFuwuContent(String fuwuContent) {
        this.fuwuContent = fuwuContent;
    }
    /**
	 * 设置：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：申请时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：是否同意
	 */
    public Integer getFuwuYesNoTypes() {
        return fuwuYesNoTypes;
    }


    /**
	 * 获取：是否同意
	 */

    public void setFuwuYesNoTypes(Integer fuwuYesNoTypes) {
        this.fuwuYesNoTypes = fuwuYesNoTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
