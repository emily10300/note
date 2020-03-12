package note.emily.mapper;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.IService;

import note.emily.bo.AccountBO;
import note.emily.entity.Account;

/* AccountService*/
public interface AccountMapper extends IService<Account>{

	public void insertAccount(@Valid AccountBO accountBO);
}