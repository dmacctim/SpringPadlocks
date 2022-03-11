package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Padlock;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.PadlockRepository;

@SpringBootApplication
public class SpringPadlocksApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringPadlocksApplication.class, args);
	}
	
	@Autowired
	PadlockRepository repo;

	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Padlock p1 = appContext.getBean("padlock", Padlock.class);
		repo.save(p1);
		
		Padlock p2 = new Padlock("Master Lock", "570", 5, true);
		repo.save(p2);
		
		List<Padlock> allPadlocks = repo.findAll();
		for (Padlock p : allPadlocks) {
			System.out.println(p.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	}

}
