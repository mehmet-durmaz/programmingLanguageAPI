package javakamp.kendiprojem.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.kendiprojem.business.abstracts.ProgrammingLanguageService;
import javakamp.kendiprojem.dataAccess.abstracts.ProgrammingLanguageRepository;
import javakamp.kendiprojem.entities.concretes.ProgrammingLanguage;
@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;
	
	
	
	public ProgrammingLanguageManager() {
		
	}
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}


	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {
		
			if(programmingLanguage.getName().isEmpty())  {
				throw new Exception("lutfen bos birakmayin");
			}
			for (ProgrammingLanguage programminglang : getAll()) {
				if(programminglang.getName().equals(programmingLanguage.getName())) {
					throw new Exception("bu isimde bir eleman zaten bulunmaktadir");
				}
			}
			programmingLanguageRepository.add(programmingLanguage);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) throws Exception {
		if(programmingLanguage.getName().isEmpty()) {
			throw new Exception("lutfen bos birakmayin");
		}
		for (ProgrammingLanguage programminglang : getAll()) {
			if(programminglang.getName() == programmingLanguage.getName()) {
				throw new Exception("bu isimde bir eleman zaten bulunmaktadir");
			}
		}
		
		programmingLanguageRepository.update(programmingLanguage);
		
	}

	@Override
	public void delete(int id) {
		
		programmingLanguageRepository.delete(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		
		
		return programmingLanguageRepository.getAll();
		
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		
		return programmingLanguageRepository.getById(id);
		
	}

}
 