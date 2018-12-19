package com.dedao.service;

import com.dedao.domain.Account;

import java.util.List;

/**
 * author:admin
 * Date:2018/12/19
 * Time:9:43
 */
public interface IAccountService {
    /*
        查询所有
     */
    List<Account> findAll();

    //根据id查询指定账户
    Account findAccountById(Integer id);

    //保存账户
    void saveAccount(Account account);

    //删除账户
    void deleteAccount(Integer id);

    //根据id修改账户
    void updateAccount(Integer id,Double money);
}
