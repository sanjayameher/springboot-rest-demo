package app;

import org.springframework.web.client.RestTemplate;

import java.net.URI;
import app.model.*;


public class ApplicationTest {
    public static final String REST_SERVICE_URI = "http://localhost:8888/book";

    private static void createUser() {
        System.out.println("Testing create User API----------");
        RestTemplate restTemplate = new RestTemplate();
        Book book = new Book("sample7","Sammer7","Manas7",7);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI, book, Book.class);

        System.out.println("Record inserted successfully in book collection");
       // System.out.println("Location : "+uri.toASCIIString());
    }

    public static void main(String args[]){
        /*listAllUsers();
        getUser();
        createUser();
        listAllUsers();
        updateUser();
        listAllUsers();
        deleteUser();
        listAllUsers();
        deleteAllUsers();
        listAllUsers();*/
        createUser();
    }
}
