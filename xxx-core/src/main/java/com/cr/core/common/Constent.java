package com.cr.core.common;

public interface Constent {

    public static final int RET_OK_CODE = 1;
    public static final int RET_SEND_OK_CODE = 4;
    public static final int RET_FAILURE_CODE = 0;
    public static final String RETURN_CODE = "result";
    public static final String RETURN_MSG = "msg";
    public static final String RETURN_SEND_TYPE = "sendType";

    public static final String RETURN_MSG_SUCCESS = "SUCCESS";
    public static final String RETURN_MSG_ERROR = "服务器繁忙，请联系客服！";
    public static final String RETURN_MSG_NULL = "暂无数据...";
    public static final String RETURN_MSG_EDIT_FAIL = "操作数据失败...";
    public static final String RETURN_MSG_PARAMS_NULL = "空数据包...";
    public static final String RETURN_MSG_CHECK_APP_FAIL = "密钥验证失败...";
    public static final String RETURN_MSG_ACCOUNT_EXIST = "用户名已存在...";
    public static final String RETURN_MSG_ACCOUNT_NOT_EXIST = "用户名不存在...";

    String LOGIN_ERROR_CODE_100001 = "100001";
    String LOGIN_ERROR_MESSAGE_USERERROR = "账号或密码错误，请重新输入！";

    String LOGIN_ERROR_CODE_100002 = "100002";
    String LOGIN_ERROR_MESSAGE_SYSTEMERROR = "用户已经被锁定不能登录，请与管理员联系！";

    String LOGIN_ERROR_CODE_100003 = "100003";
    String LOGIN_ERROR_MESSAGE_MAXERROR = "登录失败次数过多,锁定10分钟！";

    String LOGIN_ERROR_CODE_100004 = "100004";
    String LOGIN_ERROR_MESSAGE_FORCELOGOUT = "您已经被管理员强制退出，请重新登录";

    /************ 显示状态 ************/
    abstract class EnableState {
        /************ 显示 ************/
        public static final int ENABLE_STATE_DISPLAY = 22;
        /************ 不显示 ************/
        public static final int ENABLE_STATE_DISABLE = 23;
    }

}
