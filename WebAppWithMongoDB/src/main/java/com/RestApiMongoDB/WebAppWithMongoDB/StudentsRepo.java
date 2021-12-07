package com.RestApiMongoDB.WebAppWithMongoDB;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentsRepo extends MongoRepository<Students,String> {
}
