package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import dmacc.beans.Padlock;
import dmacc.repository.PadlockRepository;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Mar 29, 2022  
*/
@Controller
public class WebController {
	@Autowired
	PadlockRepository repo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllPadlocks(Model model) {
		if (repo.findAll().isEmpty()) {
			return addNewPadlock(model);
		}

		model.addAttribute("padlocks", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputPadlock")
	public String addNewPadlock(Model model) {
		Padlock p = new Padlock();
		model.addAttribute("newPadlock", p);
		return "input";
	}
	
	@PostMapping("/inputPadlock")
	public String addNewPadlock(@ModelAttribute Padlock p, Model model) {
		repo.save(p);
		return viewAllPadlocks(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdatePadlock(@PathVariable("id") long id, Model model) {
		Padlock p = repo.findById(id).orElse(null);
		model.addAttribute("newPadlock", p);
		return "input";
	}
	
	@PostMapping("/update/{id}")
	public String revisePadlock(Padlock p, Model model) {
		repo.save(p);
		return viewAllPadlocks(model);
	}
	
	@GetMapping("/delete/{id}")
	public String deletePadlock(@PathVariable("id") long id, Model model) {
		Padlock p = repo.findById(id).orElse(null);
		repo.delete(p);
		return viewAllPadlocks(model);
	}
}
