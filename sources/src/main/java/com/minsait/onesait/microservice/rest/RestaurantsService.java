package com.minsait.onesait.microservice.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.minsait.onesait.microservice.model.RestaurantsWrapper;
import com.minsait.onesait.microservice.repository.RestaurantsRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("Restaurants")
@Api(value = "Restaurants REST service", tags = { "Restaurants" })
@ApiResponses({ @ApiResponse(code = 429, message = "Too Many Requests"),
		@ApiResponse(code = 500, message = "Error processing request"),
		@ApiResponse(code = 403, message = "Forbidden") })
@Slf4j
public class RestaurantsService {

	@Autowired
	private RestaurantsRepository ontologyRepository;

	@GetMapping
	@ApiOperation(response = RestaurantsWrapper[].class, httpMethod = "GET", value = "Return all Restaurants")
	@ApiResponse(code = 429, message = "Too Many Requests")
	public ResponseEntity<List<RestaurantsWrapper>> getAllRestaurantss() {
		log.info("Getting all registered Restaurantss");
		final List<RestaurantsWrapper> ontologies = ontologyRepository.findAll();

		return new ResponseEntity<>(ontologies, HttpStatus.OK);
	}
}
