package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Padlock;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Mar 10, 2022  
*/
@Configuration
public class BeanConfiguration {
	@Bean
	public Padlock padlock() {
		Padlock bean = new Padlock("Master Lock", "No. 3", 4, false);
		return bean;
	}
}
