package common;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
//    private int[] list;

}
