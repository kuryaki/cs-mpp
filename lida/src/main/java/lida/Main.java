package lida;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

import model.Account;
import spark.ModelAndView;
import spark.template.mustache.MustacheTemplateEngine;

public class Main {
	public static void main(String[] args) {
		
		MongoClient mongoClient = new MongoClient(new ServerAddress("localhost", 27017));
		
		final Morphia morphia = new Morphia();
		morphia.mapPackage("model");
		
		final Datastore datastore = morphia.createDatastore(mongoClient, "test");
		datastore.ensureIndexes();

		// Controller Layer
//		final Account behailu = new Account("behailu");
//		datastore.save(behailu);
		
		final Query<Account> query = datastore.createQuery(Account.class).field("name").equal("behailu");
		final Account behailu = query.get();
		
		port(getHerokuAssignedPort());
		staticFiles.location("/static");
		
		// View Layer
		Map map = new HashMap();
        map.put("name", behailu.getName());
        
        get("/hello", (req, res) -> new ModelAndView(map, "hello.html"), new MustacheTemplateEngine());
    }
	
	static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }
}
