package com.dedao.service.impl;

import com.dedao.dao.IAccountDao;
import com.dedao.domain.Account;
import com.dedao.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:admin
 * Date:2018/12/19
 * Time:9:46
 */
@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    @Override
    public Account findAccountById(Integer id) {
        Account account = accountDao.findAccountById(id);
        return account;
    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }

    @Override
    public void updateAccount(Integer id,Double money) {
        accountDao.updateAccount(id,money);
    }
}
