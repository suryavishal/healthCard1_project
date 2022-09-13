package com.healthid.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healthid.Repository.HcardRepository;
import com.healthid.entities.Hcards;

@Service
public class HcardsServiceImpl implements HcardsService {
	
	@Autowired
	private HcardRepository hcardRepo;

	@Override
	public void saveOneData(Hcards hcard) {
	hcardRepo.save(hcard);

	}

	@Override
	public List<Hcards> listall() {
	List<Hcards> hcard = hcardRepo.findAll();
	return hcard;
	}

	@Override
	public void deleteById(long id) {
	hcardRepo.deleteById(id);
		
	}

	@Override
	public Hcards updatebyId(long id){
	Optional<Hcards> findById = hcardRepo.findById(id);
	Hcards hcard = findById.get();
	return hcard;
	}
      
		
	}
	

