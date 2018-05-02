package top.siki.order.VO;

import lombok.Data;

/**
 * Created by wiki
 * 2017-12-10 18:02
 * @author wiki
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;
}
