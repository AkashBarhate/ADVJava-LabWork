package com.Interface;

import java.util.List;

import com.MainProject.CarPart;

public interface CarPartsInventory {

	
	public void addNewPart(CarPartsInventory carPart);
	public List<CarPart> getAvailableParts();
}
