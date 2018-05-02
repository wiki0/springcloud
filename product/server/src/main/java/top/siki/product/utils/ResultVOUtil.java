package top.siki.product.utils;


import top.siki.product.VO.ResultVO;

/**
 * 2017-12-09 22:53
 * @author wiki
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
