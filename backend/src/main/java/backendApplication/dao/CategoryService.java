package backendApplication.dao;

import backendApplication.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryRepository repo;

    public void save(Category admin) {
        repo.save(admin);
    }

    public List<Category> listAll() {
        return (List<Category>) repo.findAll();
    }

    public Category get(String id) throws NoSuchElementException {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}

