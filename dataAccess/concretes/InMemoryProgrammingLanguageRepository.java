package javakamp.kendiprojem.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;
import javakamp.kendiprojem.dataAccess.abstracts.ProgrammingLanguageRepository;
import javakamp.kendiprojem.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
	
	List<ProgrammingLanguage> programmingLanguages;
	
	
	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"C#"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(4,"JavaScript"));
		
		
	}


	@Override
	public List<ProgrammingLanguage> getAll() {
		
		return programmingLanguages ;
	}


	@Override
	public ProgrammingLanguage getById(int id) {
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			if(programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) {
	
		programmingLanguages.add(programmingLanguage);
		
	}


	@Override
	public void delete(int id) {
		
		programmingLanguages.remove(id);
	}


	@Override
	public void update(ProgrammingLanguage programmingLanguage) {
		
		for (ProgrammingLanguage programmingLang : programmingLanguages) {
			if(programmingLang.getId() == programmingLanguage.getId()) {
				programmingLang.setName(programmingLanguage.getName());
			}
		}
	}

	
		
	

}
	

