package com.pwrd.account.dao;

import java.util.List;

import com.pwrd.account.entity.AccountType;
import com.pwrd.account.entity.Account_Books;
/**
 * ��ѯ��¼Dao�ӿ�
 * @author PwRd����
 *
 */
public interface Account_BooksDao {
	// ��ѯ����
	public int count(String user_id);
	// ��ѯȫ��
	public List<Account_Books> findAll(String user_id, int first_index, int last_index);
	// ���ڲ�ѯ
	// �²�ѯ
	// �ղ�ѯ
	
}
