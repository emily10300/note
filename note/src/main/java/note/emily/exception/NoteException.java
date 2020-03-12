package note.emily.exception;


import not.emily.enums.base.BaseEnum;

public class NoteException extends RuntimeException {

    private String code;
    private BaseEnum baseEnum;
    private Object data;

    public NoteException(BaseEnum baseEnum) {
        super(baseEnum.getMsg());
        code = baseEnum.getCode();
        this.baseEnum = baseEnum;
    }

    public NoteException(BaseEnum baseEnum, Object data) {
        super(baseEnum.getMsg());
        code = baseEnum.getCode();
        this.baseEnum = baseEnum;
        this.data = data;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public BaseEnum getBaseEnum() {
		return baseEnum;
	}

	public void setBaseEnum(BaseEnum baseEnum) {
		this.baseEnum = baseEnum;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
