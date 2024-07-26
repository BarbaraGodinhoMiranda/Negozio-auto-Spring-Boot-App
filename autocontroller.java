package com.example.demo;


import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;

@Controller
public class autocontroller {
	
	ArrayList<auto> lista = new ArrayList<>();
	
	 @GetMapping("/Auto")
	    public String getAutomobile(Model model) {

		 auto a1 = new auto();
	    	a1.setModello("Modello");
	    	a1.setMarca("Porche");
	    	a1.setTipologia("SUV");
	    	a1.setPrezzo(150000);
	    	a1.setImg("Cayenne.jpg");
	    	System.out.println(a1.getImg());
	    	
	    	
	    	model.addAttribute("auto", a1);
	        return "automobile";
}
	 @GetMapping("/form")
	    public String getForm(Model model) {
	    	
	        return "form";
	       }
	 
	 @PostMapping("/submit") 
 		public String getDate(@RequestParam("modello") String modello,
             @RequestParam("marca") String marca, @RequestParam("tipologia") String tipologia,
             @RequestParam("prezzo") String prezzo, @RequestParam("img") String img,  Model model) 	{
 	
 	
 	
 	
 	
 	model.addAttribute("modello", modello);
 	model.addAttribute("marca", marca);
 	model.addAttribute("tipologia", tipologia);
 	Double prezzo1 = Double.parseDouble(prezzo);
 	model.addAttribute("img", img);
 	
 	
 	
 	auto a1 = new auto();
 	a1.setModello(modello);
 	a1.setMarca(marca);
 	a1.setTipologia(tipologia);
 	a1.setPrezzo(prezzo1);
 	a1.setImg(img);
 	
 	
 	
 	lista.add(a1);
			
 	
 	return "post";
}
	 @GetMapping("/show")
	    public String getLista(Model model) {
	    	model.addAttribute("lista", lista);
	        return "automobile";
	       }
}
