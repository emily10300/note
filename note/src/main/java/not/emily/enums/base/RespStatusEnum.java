package not.emily.enums.base;

public enum RespStatusEnum{

    SUCCESS(0, "成功"),
    FAILURE(1, "失敗");

    public Integer status;
    public String description;
    RespStatusEnum(Integer status, String description) {
        this.status = status;
        this.description = description;
    }
}
