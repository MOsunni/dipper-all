package junit;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.AdminDao;
import entity.Admin_action;
import entity.Admin_im;
import iservice.IAdminService;
import service.AdminService;

public class Junit_admin {
	
	/**
	 * 测试查询所有admin元素
	 * @return list
	 * @throws Exception
	 */
	@Test
	public void selectAllAdmin() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("bean.xml");
		IAdminService adminDao =(AdminService) applicationContext.getBean("adminService");
		
		List<Admin_im> adminList = adminDao.findAllAdmin();
		for(Admin_im admin_im:adminList){
			System.out.println(admin_im.getAdmin_username());
		}
	}
	
	/**
	 * 测试验证后台登陆管理员
	 * @throws Exception
	 */
	@Test
	public void selectByNamePassword() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config/bean-base.xml");
		AdminDao adminDao =(AdminDao) applicationContext.getBean("adminDao");
		
		Admin_im admin_im = adminDao.selectByNamePassword("root", "root");
		System.out.println(admin_im.getAdmin_id());
	}
	
	/**
	 * 测试查询所有 权限 admin_action元素
	 * @throws Exception
	 */
	@Test
	public void selectAllAction() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config/bean-base.xml");
		AdminDao adminDao =(AdminDao) applicationContext.getBean("adminDao");
		
		List<Admin_action> admin_actionList = adminDao.selectAllAction();
		for(Admin_action admin_action : admin_actionList){
			System.out.println(admin_action.getAdmin_action_name() + ":" + admin_action.getAdmin_action_note());
		}
	}
	
	/**
	 * 测试新增admin元素
	 * @return list
	 * @throws Exception
	 */
	@Test
	public void insertAdmin() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config/bean-base.xml");
		AdminDao adminDao =(AdminDao) applicationContext.getBean("adminDao");
		
		Admin_action admin_action = new Admin_action();
		admin_action.setAdmin_action_id(1);
		Admin_im admin_im = new Admin_im();
		admin_im.setAdmin_username("root1");
		admin_im.setAdmin_password("root1");
		admin_im.setAdmin_name("jack");
		admin_im.setAdmin_phone("13845724779");
		admin_im.setAdmin_email("111111@163.com");
		admin_im.setAdmin_action_id(1);
		adminDao.insert(admin_im);
	}
	
	/**
	 * 测试更新admin元素
	 * @throws Exception
	 */
	@Test
	public void updateAdmin() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config/bean-base.xml");
		AdminDao adminDao =(AdminDao) applicationContext.getBean("adminDao");
		
		Admin_action admin_action = new Admin_action();
		admin_action.setAdmin_action_id(1);
		Admin_im admin_im = new Admin_im();
		admin_im.setAdmin_id(3);
		admin_im.setAdmin_username("root3");
		admin_im.setAdmin_password("root2");
		admin_im.setAdmin_name("jack");
		admin_im.setAdmin_phone("13845724779");
		admin_im.setAdmin_email("111111@163.com");
		admin_im.setAdmin_action_id(1);
		adminDao.update(admin_im);
	}
	
	/**
	 * 测试删除admin元素
	 * @throws Exception
	 */
	@Test
	public void deleteAdmin() throws Exception{
		
		ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("config/bean-base.xml");
		AdminDao adminDao =(AdminDao) applicationContext.getBean("adminDao");
		
		adminDao.delete(3);
	}
}
