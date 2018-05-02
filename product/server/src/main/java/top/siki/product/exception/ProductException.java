package top.siki.product.exception;

import top.siki.product.enums.ResultEnum;

/**
 * @author wiki
 */
public class ProductException extends RuntimeException{

    private Integer code;

    public ProductException(Integer code , String message){
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
