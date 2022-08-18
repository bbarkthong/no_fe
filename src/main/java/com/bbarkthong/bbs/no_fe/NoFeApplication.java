package com.bbarkthong.bbs.no_fe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = { "" })
public class NoFeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoFeApplication.class, args);
	}

}
