package com.pwrd.account.dao;

import java.util.List;

import com.pwrd.account.entity.AccountType;
import com.pwrd.account.entity.Account_Books;
/**
 * 查询记录Dao接口
 * @author PwRd冰糖
 *
 */
public interface Account_BooksDao {
	// 查询总数
	public int count(String user_id);
	// 查询全部
	public List<Account_Books> findAll(String user_id, int first_index, int last_index);
	// 日期查询
	// 月查询
	// 日查询
	
}
