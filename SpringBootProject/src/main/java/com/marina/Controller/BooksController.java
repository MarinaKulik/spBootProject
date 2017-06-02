package com.marina.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@Autowired
	private BookService bService;
	
	@RequestMapping("books")
	public List<Books> getAllBooks(){
		return bService.getAllBooks();
		
	}
	@RequestMapping("/books/{id}")
	public Books getOneBook(@PathVariable int id){
		return bService.getOneBook(id);
	
	}
	@RequestMapping(method=RequestMethod.POST, value="/books")
	public void addBook(@RequestBody Books book){
		bService.addBook(book);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/books/{id}")
	public void updateBook(@RequestBody Books book, @PathVariable int id ){
		bService.updateBook(book, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/books/{id}")
	public void deleteBook(@PathVariable int id ){
		bService.deleteBook( id);
	}

}
