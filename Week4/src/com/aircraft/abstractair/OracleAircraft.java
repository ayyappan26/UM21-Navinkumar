package com.aircraft.abstractair;

import com.aircraft.dao.AirOracleDao;
import com.aircraft.dao.AircraftIDao;

public class OracleAircraft extends AbstractAircraft{

	
	public AircraftIDao getDao() {
	
		return new AirOracleDao();
	}

}
