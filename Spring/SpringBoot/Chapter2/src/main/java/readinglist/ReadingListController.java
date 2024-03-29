package readinglist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class ReadingListController {
    private static final String reader="craig";

    private ReadingListRepository readingListRepository;

    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository) {
        System.out.println(readingListRepository);
        this.readingListRepository=readingListRepository;
    }

    @RequestMapping(value="{category}",method=RequestMethod.GET)
    public String readerBooks(Model model) {
        List<Book> readingList=readingListRepository.findByReader(reader);
        if(readingList != null) {
            model.addAttribute("books", readingList);
        }
        return "readingList";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String addToReadingList(Book book) {
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/";
    }
}
