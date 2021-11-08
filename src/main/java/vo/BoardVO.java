package vo;

import lombok.Data;
import java.util.Date;

@Data
public class BoardVO {

    private int rnum;
    private int bno;
    private int typeno;
    private String title;
    private String content;
    private String writer;
    private Date regdate;
    private Date updatedate;

}
