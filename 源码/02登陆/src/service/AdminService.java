package service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import dao.AdminDao;
import entity.Admin_action;
import entity.Admin_im;
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

}
