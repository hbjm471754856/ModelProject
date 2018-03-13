package com.cr.core.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:提供所有返回类型方法
 *
 * @author YAOGANG 2016年12月13日 下午1:54:08
 */
public class ResultType implements Constent {

    /**
     * @param data
     * @return Map<String , Object>
     */
    public static Map<String, Object> getSuccessMap(Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(RETURN_CODE, RET_OK_CODE);
        map.put(RETURN_MSG, RETURN_MSG_SUCCESS);
        map.put("data", data);
        return map;
    }

    public static Map<String, Object> getFailMap(String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put(RETURN_CODE, RET_FAILURE_CODE);
        map.put(RETURN_MSG, msg);
        return map;
    }

}
