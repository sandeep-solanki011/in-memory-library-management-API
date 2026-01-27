package com.library.controller;

import com.library.model.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    //Add  a Book


    @PostMapping
    public ResponseEntity<String> addBook(@RequestBody Book book)
    {
        bookList.add(book);
        return ResponseEntity.ok("Book added Succesfully");
    }

    //Get all Books
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks()
    {
        return ResponseEntity.ok(bookList);
    }

    //get book by id

    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id){
        for(Book book:bookList)
        {
            if(book.getId()==id)
            {
                return ResponseEntity.ok(book);
            }
        }
        return ResponseEntity.notFound().build();
    }

    //Search Book By year
    @GetMapping("/search/{year}")
    public ResponseEntity<List<Book>> searchByYear(@RequestParam int year) {

        List<Book> result = new ArrayList<>();

        for (Book book : bookList) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }

        return ResponseEntity.ok(result);
    }

    //Delete book by id

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable int id) {

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == id) {
                bookList.remove(i);
                return ResponseEntity.ok("Book deleted successfully");
            }
        }

        return ResponseEntity.status(404).body("Book not found");
    }



}


