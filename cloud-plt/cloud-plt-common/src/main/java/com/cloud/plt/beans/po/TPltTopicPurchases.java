package com.cloud.plt.beans.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import com.cloud.common.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

/**
 * 促销品表
 *
 * @author Aijm
 * @date 2019-12-28 15:56:54
 */
@Data
@TableName("t_plt_topic_purchases")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "促销品表")
public class TPltTopicPurchases extends BaseEntity<TPltTopicPurchases> {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "srm单据ID")
    private String srmId;

    @ApiModelProperty(value = "主题")
    private String topicName;

    @ApiModelProperty(value = "公司ID")
    private Long companyId;

    @ApiModelProperty(value = "公司名称")
    private String companyName;

    @ApiModelProperty(value = "申请人ID")
    private Long applicationUserId;

    @ApiModelProperty(value = "申请人")
    private String applicationUser;

    @ApiModelProperty(value = "申请时间")
    private LocalDateTime applicationTime;

    @ApiModelProperty(value = "申请类型 0：采购申请 1：临时申请")
    private String applicationType;

    @ApiModelProperty(value = "附件")
    private String attachment;

    @ApiModelProperty(value = "促销品说明")
    private String description;

    @ApiModelProperty(value = "合计数量")
    private Long amount;

    @ApiModelProperty(value = "状态类型")
    private String type;


}
