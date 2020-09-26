package com.net.educos;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.net.educos.controller.Econtroller;

@SpringBootApplication
@ComponentScan({"com.net.educos","controller"})
public class EducosApplication {

	public static void main(String[] args) {
		new File(Econtroller.uploadDirectory).mkdir();
		SpringApplication.run(EducosApplication.class, args);
	}

}
