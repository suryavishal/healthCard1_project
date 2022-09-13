package com.healthid.Services;

import java.util.List;

import com.healthid.entities.Hcards;

public interface HcardsService {

	public void saveOneData(Hcards hcard);

	public List<Hcards> listall();

	public void deleteById(long id);

	public Hcards updatebyId(long id);
}
