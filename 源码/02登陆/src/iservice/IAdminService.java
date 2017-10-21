package iservice;

import java.util.List;

import entity.Admin_action;
import entity.Admin_im;

public interface IAdminService {
	//查看所有admin
	public List<Admin_im> findAllAdmin() throws Exception;
	//登陆验证
	public Admin_im login(String username,String password) throws Exception;
	//查看所有权限
	public List<Admin_action> selectAllAction() throws Exception;
	//新增管理员
	public void insert(Admin_im admin_im) throws Exception;
	//更新管理员
	public void update(Admin_im admin_im) throws Exception;
	//删除管理员
	public void delete(int id) throws Exception;
}
