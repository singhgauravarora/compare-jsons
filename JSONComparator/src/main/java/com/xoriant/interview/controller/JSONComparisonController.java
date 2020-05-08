package com.xoriant.interview.controller;

import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xoriant.interview.exception.ResourceNotFoundException;
import com.xoriant.interview.model.BaseJsonData;
import com.xoriant.interview.service.JSONComparisonService;

@RestController
@RequestMapping("/v1/json-data")
public class JSONComparisonController {

	@Autowired
	JSONComparisonService jsonComparisonService;

	@GetMapping("/{id}")
	public ResponseEntity<String> getBaseJsonData(@PathVariable("id") Long id) throws ResourceNotFoundException {
		String baseJson = jsonComparisonService.getBaseJsonById(id);
		return new ResponseEntity<String>(baseJson, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<BaseJsonData> addBaseJsonData(@Valid @RequestBody String baseJsonData)
			throws ResourceNotFoundException {
		BaseJsonData added = jsonComparisonService.addBaseJsonData(baseJsonData);
		return new ResponseEntity<BaseJsonData>(added, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<BaseJsonData> updateBaseJsonData(@Valid @RequestBody String baseJsonData, @PathVariable("id") Long id)
			throws ResourceNotFoundException {
		BaseJsonData updated = jsonComparisonService.addOrUpdateBaseJsonData(baseJsonData, id);
		return new ResponseEntity<BaseJsonData>(updated, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteBaseJsonData(@PathVariable("id") Long id) throws ResourceNotFoundException {
		jsonComparisonService.deleteBaseJsonData(id);
		return HttpStatus.OK;
	}
	
	@GetMapping("/compare-jsons/{id}")
	public ResponseEntity<String> getBaseJsonData(@RequestBody String inputJson, @PathVariable("id") Long id) throws ResourceNotFoundException, IOException {
		String jsonDifference = jsonComparisonService.getJsonDifference(inputJson, id);
		return new ResponseEntity<String>(jsonDifference, new HttpHeaders(), HttpStatus.OK);
	}
}
