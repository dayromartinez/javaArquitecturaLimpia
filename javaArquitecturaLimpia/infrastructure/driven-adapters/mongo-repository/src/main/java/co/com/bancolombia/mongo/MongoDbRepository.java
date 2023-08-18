package co.com.bancolombia.mongo;

import co.com.bancolombia.model.suma.Suma;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import reactor.core.publisher.Flux;

public interface MongoDbRepository extends ReactiveMongoRepository<Object/* change for adapter model */, String>, ReactiveQueryByExampleExecutor<Object/* change for adapter model */> {

}
