package cn.lqdev.learning.springcloud.zuul.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import lombok.extern.slf4j.Slf4j;

/**
 * zuul使用swagger2聚合微服务api示例
 * @author oKong
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@Slf4j
public class ZuulSwaggerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulSwaggerApplication.class, args);
		log.info("spring-cloud-zuul-gateway启动!");
	}
}
