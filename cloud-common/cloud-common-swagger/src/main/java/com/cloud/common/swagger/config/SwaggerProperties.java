package com.cloud.common.swagger.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Aijm
 * @Description swagger 配置
 * @Date 2019/12/30
 */
@Data
@ConfigurationProperties("swagger")
public class SwaggerProperties {
	/**
	 * 是否开启swagger
	 */
	private Boolean enabled;
	/**
	 * swagger会解析的包路径
	 **/
	private String basePackage = "";

	/**
	 * 标题
	 **/
	private String title = "";
	/**
	 * 描述
	 **/
	private String description = "";
	/**
	 * 版本
	 **/
	private String version = "";
	/**
	 * 许可证
	 **/
	private String license = "";
	/**
	 * 许可证URL
	 **/
	private String licenseUrl = "";
	/**
	 * 服务条款URL
	 **/
	private String termsOfServiceUrl = "";

	/**
	 * host信息
	 **/
	private String host = "";
	/**
	 * 联系人信息
	 */
	private Contact contact = new Contact();
	/**
	 * 全局统一鉴权配置
	 **/
	private Authorization authorization = new Authorization();

	@Data
	@NoArgsConstructor
	public static class Contact {

		/**
		 * 联系人
		 **/
		private String name = "";
		/**
		 * 联系人url
		 **/
		private String url = "";
		/**
		 * 联系人email
		 **/
		private String email = "";

	}

	@Data
	@NoArgsConstructor
	public static class Authorization {

		private String  userAuthorizationUri;

	}

}
