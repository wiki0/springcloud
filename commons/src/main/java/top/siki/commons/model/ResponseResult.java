package top.siki.commons.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * 2018-03-04 23:25
 * @author wiki
 */
@Data
@Getter
@Setter
public class ResponseResult<T> {
    private Integer code;
    private String msg;
    private T data;
}
