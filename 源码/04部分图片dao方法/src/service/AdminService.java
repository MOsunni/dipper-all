package service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.AdminDao;
import entity.Admin_action;
import entity.Admin_im;
import entity.Authority_admin;
import entity.Authority_url;
import iservice.IAdminService;

@Service
public class AdminService implements IAdminService {
	
	@Resource
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	@Override
	public List<Admin_im> findAllAdmin() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.findAllAdmin();
	}

	@Override
	public Admin_im login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.selectByNamePassword(username, password);
	}

	@Override
	public List<Admin_action> selectAllAction() throws Exception {
		// TODO Auto-generated method stub
		return adminDao.selectAllAction();
	}

	@Override
	public void insert(Admin_im admin_im) throws Exception {
		// TODO Auto-generated method stub
		adminDao.insert(admin_im);
	}

	@Override
	public void update(Admin_im admin_im) throws Exception {
		// TODO Auto-generated method stub
		adminDao.update(admin_im);
	}

	@Override
	public void delete(int id) throws Exception {
		// TODO Auto-generated method stub
		adminDao.delete(id);
	}
	
	@Override
	public List<Authority_url> selectAllAuthority_url() throws Exception{
		// TODO Auto-generated method stub
		return adminDao.selectAllAuthority_url();
	}
	
	@Override
	public List<Authority_admin> selectAuthority_adminByAdmin_action_id(int admin_action_id) throws Exception {
		// TODO Auto-generated method stub
		return adminDao.selectAuthority_adminByAdmin_action_id(admin_action_id);
	}
	
	@Override
	public Authority_url selectAuthority_url(int authority_url_id) throws Exception{
		// TODO Auto-generated method stub
		return adminDao.selectAuthority_url(authority_url_id);
	}
	
	@Override
	public List<String> selectAllUrlByAdmin_action(int admin_action_id) throws Exception {
		// TODO Auto-generated method stub
		List<Authority_admin> authority_adminList = selectAuthority_adminByAdmin_action_id(admin_action_id);
		List<String> urlList = new ArrayList<String>();
		for(int i=0;i<authority_adminList.size();i++){
			String url = authority_adminList.get(i).getAuthority_url().getAuthority_url();
			urlList.add(i, url);
		}
		return urlList;
	}
}
