package com.healthid.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.healthid.Services.HcardsService;
import com.healthid.dto.PatientData;
import com.healthid.entities.Hcards;

@Controller
public class HcardsController {
	
	@Autowired
	private HcardsService hcardService;
	
	
	// here we don't have the doGet and doPost method so we have c
	//handler method
	@RequestMapping("/createCards")
	public String viewCreateCardPage() {
	return "create_cards";// act as requestdispathcer
		
	}
    @RequestMapping("/saveCards")
	public String saveOneData(@ModelAttribute("hcard") Hcards hcard,ModelMap model) {
    hcardService.saveOneData(hcard);
    model.addAttribute("message", "cards generated!!");
	return "create_cards";
		
	}
   //dto class

//	  @RequestMapping("/saveCards")
//	    public String saveOneData(PatientData dto ,ModelMap model) {
//		  Hcards hcard =new Hcards();
//		hcard.setAdharCard(dto.getAdharCard());
//	    hcard.setName(dto.getName());
//		hcard.setAge(dto.getAge())  ;
//		hcard.setGender(dto.getGender()) ;
//		hcard.setDiseaseHistory(dto.getDiseaseHistory())  ;
//		hcard.setDurationOfIllness(dto.getDurationOfIllness());
//		hcard.setDoctorName(dto.getDoctorName())  ;
//		hcardService.saveOneData(hcard);
//	    model.addAttribute("message", "cards generated!!");
//		return "create_cards";
//	  }
	  
       @RequestMapping("/listall")
       public String ListAllpatient(ModelMap model) {
	   List<Hcards> hcard = hcardService.listall();
	   model.addAttribute("hcard", hcard);
	   return"Card_search_result";
}
       @RequestMapping("/delete")
       public String deleteOneData(@RequestParam("id") long id, ModelMap model) {
       hcardService.deleteById(id);
       List<Hcards> hcard = hcardService.listall();
       model.addAttribute("hcard", hcard);
       return"Card_search_result";
       }

       @RequestMapping("/update")
       public String updateOnedata(@RequestParam("id") long id,ModelMap model) {
       Hcards hcard = hcardService.updatebyId(id);
       model.addAttribute("hcard", hcard);
       return"update_cards";
    	   
       }
       @RequestMapping("/updatepatient")
       public String updateOnepatientData(PatientData data,ModelMap model) {
    	   Hcards hcard = new Hcards();
    	   hcard.setId(data.getId());
    	   hcard.setAdharCard(data.getAdharCard());
    	   hcard.setName(data.getName());
    	   hcard.setAge(data.getAge());
    	   hcard.setDiseaseHistory(data.getDiseaseHistory());
    	   hcard.setDurationOfIllness(data.getDurationOfIllness());
    	   hcard.setDoctorName(data.getDoctorName());
    	   
    	   hcardService.saveOneData(hcard);
    	   List<Hcards> hcards = hcardService.listall();
           model.addAttribute("hcards", hcards);
           return"Card_search_result";
    	   
       }

}


