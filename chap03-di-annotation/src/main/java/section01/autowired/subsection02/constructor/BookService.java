package section01.autowired.subsection02.constructor;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section01.autowired.common.BookDAO;
import section01.autowired.common.BookDTO;

import java.util.List;
// @Component의 세분화 어노테이션으로 Service 계층에서 사용한다.
@Service("bookServiceConstructor")
//@AllArgsConstructor
public class BookService {

    // BookDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입해준다.
//    @Autowired  // -> 필드 주입 --> 생성자 주입을 권장 따라서, AllArgsConstructor를 사용해서 생성자 주입함.
    private BookDAO bookDAO;

//    @Autowired
//    private BookDTO bookDTO;

    // Spring 4.3 버전 이후부터 생성자가 1개 뿐이라면 어노테이션을 생략해도 자동으로 생성자 주입이 동작한다.
    // 단, 생성자가 1개 이상인 경우에는 명시적으로 작성해주어야 한다.
//    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

//    public BookService(BookDAO bookDAO, BookDTO bookDTO) {
//        this.bookDAO = bookDAO;
//        this.bookDTO = bookDTO;
//    }
//
//    public BookDTO test(){return bookDTO;}
    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}