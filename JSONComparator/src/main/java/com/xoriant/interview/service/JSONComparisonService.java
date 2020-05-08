package com.xoriant.interview.service;


import java.io.IOException;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import com.xoriant.interview.exception.ResourceNotFoundException;
import com.xoriant.interview.model.BaseJsonData;
import com.xoriant.interview.repository.JsonComparisonRepository;

@Service
public class JSONComparisonService {

	@Autowired
	JsonComparisonRepository jsonComparisonRepository;
	
	@Autowired
	ObjectMapper objectMapper;

	public String getBaseJsonById(Long id) throws ResourceNotFoundException {
		BaseJsonData baseJsonData = jsonComparisonRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No input Json found for this id :: " + id));
		return baseJsonData.getInputJson().toString();
	}

	public BaseJsonData addOrUpdateBaseJsonData(@Valid String baseJson, Long id) {
		Optional<BaseJsonData> baseJsonData = jsonComparisonRepository.findById(id);

		if (baseJsonData.isPresent()) {
			BaseJsonData updatedBaseJson = baseJsonData.get();
			updatedBaseJson.setInputJson(baseJson);
			updatedBaseJson = jsonComparisonRepository.save(updatedBaseJson);
			return updatedBaseJson;
		} else {
			BaseJsonData updatedBaseJson =new BaseJsonData();
			updatedBaseJson.setInputJson(baseJson);
			updatedBaseJson = jsonComparisonRepository.save(updatedBaseJson);
			return updatedBaseJson;
		}
	}
	public BaseJsonData addBaseJsonData(String baseJson) {
			BaseJsonData updatedBaseJson =new BaseJsonData();
			updatedBaseJson.setInputJson(baseJson);
			updatedBaseJson = jsonComparisonRepository.save(updatedBaseJson);
			return updatedBaseJson;
		
	}

	public void deleteBaseJsonData(Long id) throws ResourceNotFoundException {
		BaseJsonData baseJsonData = jsonComparisonRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No input Json found for this id :: " + id));
		jsonComparisonRepository.delete(baseJsonData);
	}

	public String getJsonDifference(String inputJson, Long id) throws ResourceNotFoundException, IOException {
		BaseJsonData baseJsonData = jsonComparisonRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No input Json found for this id :: " + id));
	   String s1 = baseJsonData.getInputJson();
	   
	   JsonNode source = objectMapper.readTree(s1);
	   JsonNode target = objectMapper.readTree(inputJson);
	  // JsonDiff.asJson(source, target);
	   
	   return JsonDiff.asJson(source, target).toString();
	}

}
