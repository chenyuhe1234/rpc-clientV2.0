package com.gupaoedu.rpc.config;

import com.gupaoedu.rpc.RpcProxyClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.gupaoedu.rpc")
public class SpringConfig {


	@Bean(name = "rpcProxyClient")
	public RpcProxyClient proxyClient() {
		return  new RpcProxyClient();
	}
}