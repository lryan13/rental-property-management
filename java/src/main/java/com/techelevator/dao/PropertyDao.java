package com.techelevator.dao;

import com.techelevator.model.Property;

import java.util.List;

public interface PropertyDao {

    void addProperty(String address, int rent, boolean isAvailable, int tenantId);



}
