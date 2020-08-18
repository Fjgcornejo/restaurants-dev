package com.minsait.onesait.microservice.repository;

import java.util.List;

import com.minsait.onesait.microservice.model.RestaurantsWrapper;
import com.minsait.onesait.platform.client.springboot.aspect.IoTBrokerQuery;
import com.minsait.onesait.platform.client.springboot.aspect.IoTBrokerRepository;
import com.minsait.onesait.platform.comms.protocol.enums.SSAPQueryType;

@IoTBrokerRepository("Restaurants")
public interface RestaurantsRepository {

	@IoTBrokerQuery(value = "SELECT r FROM Restaurants as r", queryType = SSAPQueryType.SQL)
	List<RestaurantsWrapper> findAll();
}
