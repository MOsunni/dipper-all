package dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import entity.AdminMapper;
import entity.Admin_action;
import entity.Admin_im;
import idao.IAdminDao;
import utils.MyBatisUtils;

/**
 * 关于管理员的CURD操作
 * @author 46098
 */
public class AdminDao implements IAdminDao{
	
	/**
	 * 查询所有管理员信息（包括管理员权限）
	 * @return
	 * @throws Exception
	 */
	public List<Admin_im> findAllAdmin() throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			List<Admin_im> admin_imList = mapper.selectAllAdmin();
			return admin_imList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		}finally{
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
	/**
	 * 后台管理员登陆验证
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 * @throws Exception
	 */
	public Admin_im selectByNamePassword(String username,String password) throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			Map<String,Object> map = new LinkedHashMap<String,Object>();
			map.put("username", username);
			map.put("password", password);
			Admin_im admin_im = mapper.selectByNamePassword(map);
			return admin_im;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		} finally {
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
	/**
	 * 查询所有的管理员权限
	 * @return
	 * @throws Exception
	 */
	public List<Admin_action> selectAllAction() throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			List<Admin_action> admin_actionList = mapper.selectAllAction();
			return admin_actionList;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		} finally {
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
	/**
	 * insert Admin元素
	 * @param admin_im
	 * @throws Exception
	 */
	public void insert(Admin_im admin_im) throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			mapper.insert(admin_im);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		} finally {
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
	/**
	 * admin_im更新操作
	 * @param admin_im
	 * @throws Exception
	 */
	public void update(Admin_im admin_im) throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			mapper.update(admin_im);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		} finally {
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
	/**
	 * admin_im删除操作
	 * @param admin_im的id
	 * @throws Exception
	 */
	public void delete(int id) throws Exception{
		SqlSession sqlSession = MyBatisUtils.getSelSession();
		try {
			AdminMapper mapper = sqlSession.getMapper(AdminMapper.class);
			mapper.delete(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			throw e;
		} finally {
			sqlSession.commit();
			MyBatisUtils.closeSqlSession();
		}
	}
	
}
