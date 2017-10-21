package idao;

import java.util.List;

import entity.Admin_action;
import entity.Admin_im;

public interface IAdminDao {
	public List<Admin_im> findAllAdmin() throws Exception;
	public Admin_im selectByNamePassword(String username,String password) throws Exception;
	public List<Admin_action> selectAllAction() throws Exception;
	public void insert(Admin_im admin_im) throws Exception;
	public void update(Admin_im admin_im) throws Exception;
	public void delete(int id) throws Exception;
}
