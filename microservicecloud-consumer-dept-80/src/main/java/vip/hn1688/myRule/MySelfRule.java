package vip.hn1688.myRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
//		return new RandomRule();
		return new RoundRobinRule();
	}
}
