package com.api.gymtrainner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
=======
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//
 @SpringBootApplication
 @EnableAutoConfiguration(exclude = {
		 DataSourceAutoConfiguration.class,
		 DataSourceTransactionManagerAutoConfiguration.class,
		 HibernateJpaAutoConfiguration.class})
>>>>>>> feature_sonar_cloud
public class GymTrainnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymTrainnerApplication.class, args);
	}


}
