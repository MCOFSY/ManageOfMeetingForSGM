package com.seg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zsq
 */
@SpringBootApplication
@MapperScan(basePackages = "com.seg.dao")
public class SegWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SegWebApplication.class, args);
	}

}
