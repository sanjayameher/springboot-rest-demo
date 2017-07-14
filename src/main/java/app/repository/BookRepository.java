package app.repository;

import app.model.Book;

/**
 * Created by kalyani.cherukuri on 6/13/2017.
 */
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String>{
}
