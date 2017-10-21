package dao;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import entity.Admin_action;
import entity.Admin_im;

/**
 * 关于管理员的CURD操作
 * @author 46098
 */
@Repository
public class AdminDao{
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	/**
	 * 查询所有管理员信息（包括管理员权限）
	 * @return
	 * @throws Exception
	 */
	public List<Admin_im> findAllAdmin() throws Exception{
		return sqlSessionTemplate.selectList(this.getClass().getName() + ".selectAllAdmin");
	}
	
	/**
	 * 后台管理员登陆验证
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 * @throws Exception
	 */
	public Admin_im selectByNamePassword(String username,String password) throws Exception{
			Map<String,Object> map = new LinkedHashMap<String,Object>();
			map.put("username", username);
			map.put("password", password);
			return sqlSessionTemplate.selectOne(this.getClass().getName() + ".selectByNamePassword",map);
	}
	
	/**
	 * 查询所有的管理员权限
	 * @return
	 * @throws Exception
	 */
	public List<Admin_action> selectAllAction() throws Exception{
		
		return sqlSessionTemplate.selectList(this.getClass().getName() + ".selectAllAction");
	}
	
	/**
	 * insert Admin元素
	 * @param admin_im
	 * @throws Exception
	 */
	public void insert(Admin_im admin_im) throws Exception{
		
		sqlSessionTemplate.insert(this.getClass().getName() + ".insert",admin_im);
	}
	
	/**
	 * admin_im更新操作
	 * @param admin_im
	 * @throws Exception
	 */
	public void update(Admin_im admin_im) throws Exception{
		sqlSessionTemplate.update(this.getClass().getName() + ".update",admin_im);
	}
	
	/**
	 * admin_im删除操作
	 * @param admin_im的id
	 * @throws Exception
	 */
	public void delete(int id) throws Exception{
		sqlSessionTemplate.delete(this.getClass().getName() + ".delete",id);
	}
	
}
