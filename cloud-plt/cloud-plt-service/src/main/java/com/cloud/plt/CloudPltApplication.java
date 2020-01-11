package com.cloud.plt;

import com.cloud.common.cache.annotation.EnableProCache;
import com.cloud.common.data.annotation.EnableProData;
import com.cloud.common.security.annotation.EnableProSecurtity;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 *   基础模块
 * @author Aijm
 * @since  2019/5/8
 */
@SpringCloudApplication
@EnableProSecurtity
@EnableProData
@EnableProCache
@EnableFeignClients(basePackages = "com.cloud")
public class CloudPltApplication {


    public static void main(String[] args) {
        SpringApplication.run(CloudPltApplication.class, args);
    }



}




