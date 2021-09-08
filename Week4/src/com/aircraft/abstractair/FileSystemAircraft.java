package com.aircraft.abstractair;

import com.aircraft.dao.AirFileSystemDao;
import com.aircraft.dao.AircraftIDao;

public class FileSystemAircraft extends AbstractAircraft{

	
	public AircraftIDao getDao() {
		
		return new AirFileSystemDao();
	}

}
