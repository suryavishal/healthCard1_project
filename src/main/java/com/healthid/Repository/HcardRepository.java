package com.healthid.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.healthid.entities.Hcards;

public interface HcardRepository extends JpaRepository<Hcards, Long> {

	
//	public List<Hcards> findByName(String name); custom method define by user we used our own devleloped method in the application java page.
}// just like we call method in service layer. 
