package iservice;

import java.util.List;

import entity.Admin_action;
import entity.Admin_im;

public interface IAdminService {
	//�鿴����admin
	public List<Admin_im> findAllAdmin() throws Exception;
	//��½��֤
	public Admin_im login(String username,String password) throws Exception;
	//�鿴����Ȩ��
	public List<Admin_action> selectAllAction() throws Exception;
	//��������Ա
	public void insert(Admin_im admin_im) throws Exception;
	//���¹���Ա
	public void update(Admin_im admin_im) throws Exception;
	//ɾ������Ա
	public void delete(int id) throws Exception;
}
