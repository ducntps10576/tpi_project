package tpi.part4;

import org.springframework.core.env.Environment;

import tpi.dao.QueryDAO;
import tpi.dao.RequestObject;


public class Calculation {

	private static Calculation uniqueInstance;
    private Environment env;
    private QueryDAO dao;

    private Calculation(QueryDAO dao, Environment env) {
        this.env = env;
        this.dao = dao;
    }

    public static Calculation getInstance(QueryDAO dao, Environment env) {
        if (uniqueInstance == null) {
            synchronized (Calculation.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Calculation(dao, env);
                }
            }
        }
        return uniqueInstance;
    }
    
    public void performCalculation(RequestObject request) {
        String someValue = env.getProperty("abc.property");
        if (someValue != null) {
        	//abcd...
        	//set into request.......
        }
        dao.executeSomeQuery(request);
    }
}
