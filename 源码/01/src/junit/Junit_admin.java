package junit;

import java.util.List;

import org.junit.Test;

import dao.AdminDao;
import entity.Admin_action;
import entity.Admin_im;

public class Junit_admin {
	
	/**
	 * ���Բ�ѯ����adminԪ��
	 * @return list
	 * @throws Exception
	 */
	@Test
	public void selectAllAdmin() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		List<Admin_im> admin_imList = adminDao.findAllAdmin();
		for(Admin_im admin_im : admin_imList){
			System.out.println(admin_im.getAdmin_name() + ":" + admin_im.getAdmin_action().getAdmin_action_name());
		}
	}
	
	/**
	 * ������֤��̨��½����Ա
	 * @throws Exception
	 */
	@Test
	public void selectByNamePassword() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		Admin_im admin_im = adminDao.selectByNamePassword("root", "root");
		System.out.println(admin_im.getAdmin_id());
	}
	
	/**
	 * ���Բ�ѯ���� Ȩ�� admin_actionԪ��
	 * @throws Exception
	 */
	@Test
	public void selectAllAction() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		List<Admin_action> admin_actionList = adminDao.selectAllAction();
		for(Admin_action admin_action : admin_actionList){
			System.out.println(admin_action.getAdmin_action_name() + ":" + admin_action.getAdmin_action_note());
		}
	}
	
	/**
	 * ��������adminԪ��
	 * @return list
	 * @throws Exception
	 */
	@Test
	public void insertAdmin() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		Admin_action admin_action = new Admin_action();
		admin_action.setAdmin_action_id(1);
		Admin_im admin_im = new Admin_im();
		admin_im.setAdmin_username("root1");
		admin_im.setAdmin_password("root1");
		admin_im.setAdmin_name("jack");
		admin_im.setAdmin_phone("13845724779");
		admin_im.setAdmin_email("111111@163.com");
		admin_im.setAdmin_action(admin_action);
		adminDao.insert(admin_im);
	}
	
	/**
	 * ���Ը���adminԪ��
	 * @throws Exception
	 */
	@Test
	public void updateAdmin() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		Admin_action admin_action = new Admin_action();
		admin_action.setAdmin_action_id(1);
		Admin_im admin_im = new Admin_im();
		admin_im.setAdmin_id(3);
		admin_im.setAdmin_username("root3");
		admin_im.setAdmin_password("root2");
		admin_im.setAdmin_name("jack");
		admin_im.setAdmin_phone("13845724779");
		admin_im.setAdmin_email("111111@163.com");
		admin_im.setAdmin_action(admin_action);
		adminDao.update(admin_im);
	}
	
	/**
	 * ����ɾ��adminԪ��
	 * @throws Exception
	 */
	@Test
	public void deleteAdmin() throws Exception{
		
		AdminDao adminDao = new AdminDao();
		
		adminDao.delete(3);
	}
}
