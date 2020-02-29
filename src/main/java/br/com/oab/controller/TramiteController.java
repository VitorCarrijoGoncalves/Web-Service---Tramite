package br.com.oab.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import br.com.oab.model.Tramite;
import br.com.oab.response.Response;

@RestController
public class TramiteController  {

	        private static final String get = "http://192.168.10.4:81/Tramite/ListaAtual?ID_ULTIMO_TRAMITE=0"
	                + "&ProcessoFase=65333" + ""
	                + "&ProcessoInstancia=47" + ""
	                + "&ProcessoInstancia=24" + ""
	                + "&ProcessoTipoMovimento=1564628" + ""
	                + "&ProcessoTipoMovimento=1564629" + ""
	                + "&ProcessoTipoMovimento=1565188" + ""
	                + "&ProcessoTipoMovimento=1564430";
	        
	        private static final String post = "https://oabgo-homolog.corejur.com.br/"
	        		+ "redee-process/rest/engine/oabgo-homolog/process-definition/key/ceeo/start";
	    	
	    	@Autowired
	    	private RestTemplate restTemplate;

	        @GetMapping(value = get)
	    	public @ResponseBody ResponseEntity<Response<Tramite>> getTramite() {
	    		
	    		Tramite tramite = restTemplate.getForObject(get, Tramite.class);
	    		
	    		Response<Tramite> response = new Response<Tramite>();

	    		if (tramite == null) {
	    			response.getErrors().add("Register not found");
	    			return ResponseEntity.badRequest().body(response);
	    		}
	    		
	    		response.setData(tramite);
	    		return ResponseEntity.ok(response);
	    	}
	        
	    	@PostMapping(value = post, produces = "application/json")
	    	public ResponseEntity<Response<Tramite>> postTramite(HttpServletRequest request, @RequestBody Tramite tramite,
	    												 BindingResult result) {

	    		Response<Tramite> response = new Response<Tramite>();

	    		try {

	    			if (result.hasErrors()) {
	    				result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
	    				return ResponseEntity.badRequest().body(response);
	    			}

	    			response.setData(tramite);

	    		} catch (Exception e) {
	    			response.getErrors().add(e.getMessage());
	    			return ResponseEntity.badRequest().body(response);
	    		}

	    		return ResponseEntity.ok(response);
	    	}

	    }
