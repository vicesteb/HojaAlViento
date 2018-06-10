package com.hojaalviento.store.data.repositories;

import com.hojaalviento.store.data.entities.Meal;
import org.springframework.data.repository.CrudRepository;

public interface MealRepository extends CrudRepository<Meal, String>
{

}
