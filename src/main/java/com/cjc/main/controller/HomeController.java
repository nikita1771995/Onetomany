package com.cjc.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.model.Question;
import com.cjc.main.repository.QueRepository;

@RestController
public class HomeController {
	
	@Autowired
	QueRepository qr;
	
  @PostMapping("/save")	
   public String SaveData(@RequestBody Question q) {
	   
	  qr.save(q);
	return "inserted";
	   
   }
  @GetMapping("/get")
  public List<Question> getData()
  {
	  List<Question> list  =qr.findAll();
	  
	return list;
	  
  }
  @GetMapping("/get/{id}")
   public  Optional<Question> singleData(@PathVariable int id)
   {
	  Optional<Question> list=qr.findById(id);
	return list;   
   }
   @PutMapping("/update")  
  public List<Question> updateData(@RequestBody Question q)
  {
	   qr.save(q);
	   List<Question> list=qr.findAll(); 
	return list;
	  
  }
   @DeleteMapping("/delete/{id}")
   public List<Question> deleteData(@PathVariable int id)
   {
	   qr.deleteById(id);
	   List<Question> list=qr.findAll();
	return list;
	   
   }
}
