package javakamp.kendiprojem.dataAccess.abstracts;

import java.util.List;

import javakamp.kendiprojem.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(ProgrammingLanguage programmingLanguage);
}
