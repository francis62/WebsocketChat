package com.uda.websocket;

import com.uda.websocket.user.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
@SpringBootApplication
public class WebsocketApplication {

	public static void main(String[] args) {


		SpringApplication.run(WebsocketApplication.class, args);
	}

}
