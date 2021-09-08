package com.aircraft.abstractair;

import com.aircraft.dao.AirSqlDao;
import com.aircraft.dao.AircraftIDao;

public class SqlAircraft extends AbstractAircraft {

	
	public AircraftIDao getDao() {
		
		return new AirSqlDao();
	}

}
