package note.emily.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import not.emily.enums.base.AccountEnum;
import note.emily.bo.AccountBO;
import note.emily.entity.Account;
import note.emily.exception.NoteException;
import note.emily.mapper.AccountMapper;
import note.emily.service.AccountService;

@Service
public class AccountServicelmpl extends ServiceImpl<AccountService, Account> implements AccountMapper{

	@Autowired
	AccountService accountService;

	@Override
	public void insertAccount(AccountBO accountBO) {
		Account account = new Account();
		account.setMemberAccount(accountBO.getMemberAccount());
		account.setMemberName(accountBO.getMemberName());
		account.setMemberPassword(accountBO.getMemberPassword());
		
		try {
			int insert = accountService.insert(account);
			if(insert != 1) {
				throw new NoteException(AccountEnum.INSERT_DATABASE_FAILURE);
			}
		} catch (Exception e) {
			throw new NoteException(AccountEnum.DATABASE_FAILURE);
		}
	}
}
