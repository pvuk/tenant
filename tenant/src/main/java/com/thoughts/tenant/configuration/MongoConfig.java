package com.thoughts.tenant.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 * https://stackoverflow.com/questions/21386449/spring-data-and-mongodb-simple-roll-back-with-spring-within-transactional
 * https://spring.io/blog/2018/06/28/hands-on-mongodb-4-0-transactions-with-spring-data
 * https://docs.spring.io/spring-data/mongodb/docs/2.1.0.M3/api/org/springframework/data/mongodb/MongoTransactionManager.html
 * https://mongodb.github.io/mongo-java-driver-reactivestreams/
 */
@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

	@Value("${spring.data.mongodb.database}")
    private String dbName;

    @Value("${spring.data.mongodb.host}")
    private String dbHost;

    @Value("${spring.data.mongodb.port}")
    private int dbPort;
    
    @Value("${spring.data.mongodb.username}")
    private String userName;
    
    @Value("${spring.data.mongodb.password}")
    private String password;

    public MongoClient mongoClient() {
//      return MongoClients.create("mongodb://localhost:27017");//OR
//    	String hostAddress = null;
//    	try {
//			hostAddress = InetAddress.getLocalHost().getHostAddress();
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
    	return MongoClients.create(
    		            MongoClientSettings.builder()
    		                    .applyToClusterSettings(builder ->
    		                            builder.hosts(Arrays.asList(
    		                                    new ServerAddress(dbHost, dbPort)
//    		                                    ,
//    		                                    new ServerAddress(hostAddress, dbPort),
//    		                                    new ServerAddress("host3", dbPort)
    		                                    )))
    		                    .build());
    }

    public @Bean MongoTemplate mongoTemplate() {
        return new MongoTemplate(mongoClient(), "libraryDB");
    }

	@Override
	public String getDatabaseName() {
		return dbName;
	}

    @Bean
    public LocalValidatorFactoryBean validator() {
        return new LocalValidatorFactoryBean();
    }
    
}