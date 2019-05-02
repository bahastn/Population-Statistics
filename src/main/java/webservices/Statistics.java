package webservices;
import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import controller.MongoDBUtil;
import entities.Population;
import org.bson.Document;
import org.bson.conversions.Bson;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class Statistics {
  @WebMethod
  public  String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  public static void main(String[] argv) {
    Object implementor = new Statistics();
    String address = "http://localhost:9000/statistics";
    Endpoint.publish(address, implementor);

    MongoClient mongoClient = MongoDBUtil.getMongoClient();
    MongoDatabase mongoDatabase = mongoClient.getDatabase("PSI_Sample_Code");
    MongoCollection mongoCollection = mongoDatabase.getCollection("population");

      Document document = createPopulation().toDocument();
      mongoCollection.insertOne(document);
      FindIterable<Document> documents = mongoCollection.find();
      MongoCursor<Document> cursor = documents.iterator();
      try {
          while (cursor.hasNext()) {
              System.out.println(cursor.next().toString());
          }

      } finally {
          cursor.close();
      }


  }

  /**
   * Helper class for creation population object
   * initializing Object
   */
  private static Population createPopulation(){
    Population population = new Population();
    population.setZipCode("45701");
    population.setAverageHauseholdSize(4D);
    population.setGetTotalFemales(100);
    population.setTotalMales(100);
    population.setMedianAge(30D);
    population.setTotalPopulation(200);
    population.setTotalHauseholds(90);
    return population;
  }
}
