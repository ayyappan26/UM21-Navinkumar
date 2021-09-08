package project.aircraft.factory;

import project.aircraft.Dao;
import project.aircraft.MysqlDao;

public class SqlFactory extends AbstractFactory {

	public Dao getDao() {
		return new MysqlDao();
	}

}
