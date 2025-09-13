package net.blf2.example.constants;

public enum ResultCodeEnum {
    SUCCESS("1","SUCCESS"),
    FAIL("0","FAIL"),
    PARAM_ERROR("2","参数异常");

    private String code;

    private String desc;

    ResultCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
