package controller;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class MongoDBUtil {
    private static final String uri = "mongodb+srv://PSI:PSI_test@cluster0-0kcg1.mongodb.net/test?retryWrites=true";
     private static final MongoClient mongoClient = buildMongoClient();

    private static MongoClient buildMongoClient() {
        try {
            return new MongoClient( new MongoClientURI(uri));
        } catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
    public static MongoClient getMongoClient(){
        return mongoClient;
    }
}
