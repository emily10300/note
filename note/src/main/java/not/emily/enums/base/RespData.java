package not.emily.enums.base;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 回應資料
 * Controller SUCCESS
 * ex: new RespData<>(data)
 *
 * ExceptionHandler FAILURE
 * ex: new RespData<Void>(ErrorEnum)
 *
 * setData
 * ex:
 *
 * @author
 */
@ApiModel
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RespData<T> {

    @ApiModelProperty(value = "狀態, 0:成功, 1:失敗")
    private Integer status;
    @ApiModelProperty(value = "代碼")
    private String code;
    @ApiModelProperty(value = "訊息")
    private String msg;
    @ApiModelProperty(value = "参数验证错误栏位_回傳欄位及訊息")
    private Map<String, List<String>> errorFields;
    @ApiModelProperty(value = "回應資料")
    private T data;

    public RespData() {
        this.status = RespStatusEnum.SUCCESS.status;
    }

    public RespData(T data) {
        this.status = RespStatusEnum.SUCCESS.status;
        this.data = data;
    }
    
    public RespData(BaseEnum baseEnum) {
        this.status = RespStatusEnum.FAILURE.status;
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
    }

    public RespData(Integer status, BaseEnum baseEnum) {
        this.status = status;
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
    }
    
    public RespData(Integer status, BaseEnum baseEnum, T data) {
        this.status = status;
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
        this.data = data;
    }
    
    public RespData(RespStatusEnum respStatusEnum, BaseEnum baseEnum) {
        this.status = respStatusEnum.status;
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
    }
    
    public RespData(RespStatusEnum respStatusEnum, BaseEnum baseEnum, T data) {
        this.status = respStatusEnum.status;
        this.code = baseEnum.getCode();
        this.msg = baseEnum.getMsg();
        this.data = data;
    }
}
