package top.siki.client.utils;


import top.siki.client.enums.ResultEnum;
import top.siki.commons.model.ResponseResult;
import top.siki.commons.utils.ResponseUtil;

/**
 * 2018-03-04 23:25
 * @author wiki
 */
public class ResultClientUtil extends ResponseUtil {

    public static ResponseResult success() {
        ResponseResult result = new ResponseResult();
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }

    public static ResponseResult error(ResultEnum resultEnum) {
        ResponseResult result = new ResponseResult();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMessage());
        return result;
    }

}
