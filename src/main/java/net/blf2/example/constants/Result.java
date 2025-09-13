package net.blf2.example.constants;

public class Result<T> {

    private String code;

    private String msg;

    private T data;


    public static <T> Result<T> success(T data){
        Result<T> result = new Result<>();
        result.setCode(ResultCodeEnum.SUCCESS.getCode());
        result.setMsg(ResultCodeEnum.SUCCESS.getDesc());
        result.setData(data);
        return result;
    }


    public static <T> Result<T> fail(String msg,T data){
        Result<T> result = new Result<>();
        result.setCode(ResultCodeEnum.FAIL.getCode());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> paramError(String msg){
        Result<T> result = new Result<>();
        result.setCode(ResultCodeEnum.PARAM_ERROR.getCode());
        result.setMsg(msg);
        result.setData(null);
        return result;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
