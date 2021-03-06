package vip.hn1688.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

import vip.hn1688.myRule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name ="MICROSERVICECLOUD-DEPT",configuration =MySelfRule.class )
public class DeptConsumer80_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
