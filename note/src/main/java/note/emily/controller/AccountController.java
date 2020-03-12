package note.emily.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import not.emily.enums.base.AccountEnum;
import not.emily.enums.base.RespData;
import not.emily.enums.base.RespStatusEnum;
import note.emily.bo.AccountBO;
import note.emily.mapper.AccountMapper;

@RestController
public class AccountController {

	@Autowired
	AccountMapper accountMapper;
	
	/* 新增帳號**/
	@PostMapping(value = "/add/account", produces = { "application/json" })
	public RespData<String> addAccount(@Valid @RequestBody AccountBO accountBO) {
		accountMapper.insertAccount(accountBO);
		return new RespData<>(RespStatusEnum.SUCCESS, AccountEnum.SUCCESS);
	}
}
