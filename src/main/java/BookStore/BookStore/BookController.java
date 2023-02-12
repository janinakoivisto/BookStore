package BookStore.BookStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class BookController {
	@Autowired
	private BookRepository repository;
	
	@GetMapping("/index")
	public String index(Model model) {	
		model.addAttribute("message", "Welcome to the bookstore");
		return "index";
	}
	@GetMapping(value= {"/", "/booklist"})
    public String bookList(Model model) {	
        model.addAttribute("books", repository.findAll());
        return "booklist";
    }
	
	@GetMapping(value = "/addbook")
	public String addBook(Model model){
	 model.addAttribute("book", new Book());
	 return "addbook";
	}
	@PostMapping(value = "/save")
	public String save(Book book){
	 repository.save(book);
	 return "redirect:booklist";
	}
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long id, Model model) {
		repository.deleteById(id);
		return "redirect:../booklist";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String editBook(@PathVariable("id") Long id, Model model) {
		model.addAttribute("bookedit", repository.findById(id));
		return "edit";
				
	}
} 
