package project.aircraft.factory;
import project.aircraft.Dao;;

public abstract class AbstractFactory {
	public abstract Dao getDao();
	
	public static AbstractFactory getFactory(int choice){
		AbstractFactory factory=null;
		switch(choice){
		case 1:
			factory=new OracleFactory();
			break;
		case 2:
			factory=new SqlFactory();
			break;
		case 3:
			factory=new FileSystemFactory();
			break;
		}
		return factory;
	}

}
