package entity;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
	@Select("select admin_id,admin_username,admin_password from admin_im where admin_username=#{username} and admin_password=#{password}")
	public Admin_im selectByNamePassword(Map<String,Object> map);
	public List<Admin_im> selectAllAdmin();
	public List<Admin_action> selectAllAction();
	public void insert(Admin_im admin_im);
	public void update(Admin_im admin_im);
	public void delete(int id);
}
