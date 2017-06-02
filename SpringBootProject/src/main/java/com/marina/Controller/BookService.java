package com.marina.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
  private  BookRepository bookRepository;
	
//	private List<Books> listOfBooks = new ArrayList<>(Arrays.asList(new Books(1, "Pushkin", "Ruslan and Ludmila"),
//			new Books(2, "Chehov", "Cherry garden"), new Books(3, "Gogol", "Revizor")));

	public List<Books> getAllBooks() {
		List<Books> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;

	}

	public Books getOneBook(int id) {
		return bookRepository.findOne(id);
	}

	public void addBook(Books book) {
		bookRepository.save(book);
	}

	public void updateBook(Books book, int id) {
		bookRepository.save(book);

	}

	public void deleteBook(int id) {
		bookRepository.delete(id);

	}

}
