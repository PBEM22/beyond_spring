package section01.autowired.subsection01.field;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import section01.autowired.common.BookDAO;
import section01.autowired.common.BookDTO;

import java.util.List;
// @Component의 세분화 어노테이션으로 Service 계층에서 사용한다.
@Service("bookServiceField")
@AllArgsConstructor
public class BookService {

    // BookDAO 타입의 빈 객체를 이 프로퍼티에 자동으로 주입해준다.
//    @Autowired  // -> 필드 주입 --> 생성자 주입을 권장 따라서, AllArgsConstructor를 사용해서 생성자 주입함.
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks() {
        return bookDAO.selectBookList();
    }

    public BookDTO searchBookBySequence(int sequence) {
        return bookDAO.selectOneBook(sequence);
    }
}