package com.healthid;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HealthCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCardApplication.class, args);
		//ApplicationContext context = 
//	    HcardRepository hcardRepo = context.getBean(HcardRepository.class);
//		
//		List<Hcards> name = hcardRepo.findByName("vishal");
//		name.forEach(e->System.out.println(e));
	}


}
