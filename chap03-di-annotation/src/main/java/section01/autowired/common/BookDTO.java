
package section01.autowired.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Component("bookDTO")
public class BookDTO {
    private int sequence; //도서번호
    private int isbn; //isbn
    private String title; //제목
    private String author; //저자
    private String publisher; //출판사
    private Date createdDate; //출판일

//    public BookDTO() {
//        this.sequence = 5;
//        this.isbn = 123;
//        this.title = "123123";
//        this.author = "123123";
//        this.publisher = "publisher";
//        this.createdDate = new Date();
//    }
}