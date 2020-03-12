package not.emily.enums.base;

public enum AccountEnum implements BaseEnum{

	SUCCESS("1060001", "操作成功"),
	INSERT_DATABASE_FAILURE("1062109", "數據新增失敗"),
	DATABASE_FAILURE("1062111", "數據庫錯誤");
	
	private String code;
	private String msg;
	
	AccountEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	@Override
	public String getCode() {
		return code;
	}
	@Override
	public String getMsg() {
		return msg;
	}
	
	
}
