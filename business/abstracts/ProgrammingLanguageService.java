package javakamp.kendiprojem.business.abstracts;

import java.util.List;

import javakamp.kendiprojem.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	void update(ProgrammingLanguage programmingLanguage) throws Exception;
	void delete(int id);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	
}
