package mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {

    @Select("Select sysdate()")
    public String getTime();

    public String getTime2();
}
