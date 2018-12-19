package com.dedao.dao;

import com.dedao.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author:admin
 * Date:2018/12/19
 * Time:9:37
 */
@Repository
public interface IAccountDao {
    /*
        查询所有
     */
    @Select("select * from account")
    List<Account> findAll();

    //根据id查询指定账户
    @Select("select * from account where id=#{id}")
    Account findAccountById(Integer id);

    //保存账户
    @Insert("insert into account values(null,#{name},#{money})")
    void saveAccount(Account account);

    //删除账户
    @Delete("delete from account where id=#{id}")
    void deleteAccount(Integer id);

    //根据id修改账户
    @Update("update account set money=#{money} where id=#{id}")
    void updateAccount(@Param("id") Integer id,@Param("money") Double money);
}
