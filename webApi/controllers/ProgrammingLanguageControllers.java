package javakamp.kendiprojem.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.kendiprojem.business.abstracts.ProgrammingLanguageService;
import javakamp.kendiprojem.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageControllers {
	
	private ProgrammingLanguageService programmingLanguageService;
	
	@Autowired
	public ProgrammingLanguageControllers(ProgrammingLanguageService programmingLanguageService) {
		
		this.programmingLanguageService = programmingLanguageService;
	}
	
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
		
	}
	
	@GetMapping("/getbyid/{id}")
	public ProgrammingLanguage getById(@PathVariable int id) {
		return programmingLanguageService.getById(id);
	}
	
	@PostMapping("/add/{programmingLanguage}")
	public void add(@PathVariable ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.add(programmingLanguage);
	}
	
	@PutMapping("/update")
	public void update(ProgrammingLanguage programmingLanguage) {
		programmingLanguageService.update(programmingLanguage);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		programmingLanguageService.delete(id);
	}
	
}
