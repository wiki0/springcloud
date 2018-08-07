package top.siki.commons.utils;


import top.siki.commons.model.ResponseResult;

/**
 * 2018-03-04 23:25
 * @author wiki
 */
public class ResponseUtil {

    public static ResponseResult success(Object object) {
        ResponseResult result = new ResponseResult();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }
}
