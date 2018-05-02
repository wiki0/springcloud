package top.siki.order.exception;


import top.siki.order.enums.ResultEnum;

/**
 * 2017-12-10 17:27
 * @author wiki
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
