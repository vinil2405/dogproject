package com.vinilClasses.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vinilClasses.DMS.Models.Dog;

/*
 * @ author Vinil Kappa Chandrababu 
 */


public interface DogRepository extends CrudRepository<Dog,Integer> {
	
	List<Dog>findByName(String name);

}
