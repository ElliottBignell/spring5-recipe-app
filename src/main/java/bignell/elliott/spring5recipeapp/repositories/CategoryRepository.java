package bignell.elliott.spring5recipeapp.repositories;

import bignell.elliott.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 6/13/17.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

}
