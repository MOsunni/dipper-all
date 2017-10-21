package entity;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
	//�û���֤
	@Select("select admin_id,admin_username,admin_password from admin_im where admin_username=#{username} and admin_password=#{password}")
	public Admin_im selectByNamePassword(Map<String,Object> map);
	//�������й���Ա�˻�
	public List<Admin_im> selectAllAdmin();
	//�������й���Ա����
	public List<Admin_action> selectAllAction();
	//�������Ա�˻�
	public void insert(Admin_im admin_im);
	//���¹���Ա�˻�
	public void update(Admin_im admin_im);
	//ɾ������Ա�˻�
	public void delete(int id);
	
	//��ѯ����Ȩ�������Ա���� ��Ӧ��
	//���Եõ�����Ȩ��uri
	public List<Authority_url> selectAllAuthority_url();
	
	//���ݲ�ѯ�õ���action��id���Ҵ�id�����ж�Ӧ���е�����
	public List<Authority_admin> selectAuthority_adminByAdmin_action_id(int admin_action_id);
	
	//���ݲ�ѯ���Ķ�Ӧ���е�id���Ҷ�Ӧ��url
	public Authority_url selectAuthority_url(int authority_admin_id);
	
	/**
	 * ͼƬ����ط���	IMG
	 */
	//�ϴ�ͼƬ
	public void insertImg(Img img) throws Exception;
	//���ϴ�ͼƬ��ͬʱ����ͼƬ��  �ϴ���¼
	public void insertFileup(Img_fileup img_fileup) throws Exception;
	//��������ͼƬ��ͬʱ����ͼƬ��  ���ؼ�¼
	public void insertFiledown(Img_filedown img_filedown) throws Exception;
	//����ͼƬ����
	public void updateImg(Img img) throws Exception;
	
	
	/**
	 * ��ѯIMG�ķ���
	 * @return IMG����
	 * @throws Exception
	 */
	//��ѯͼƬ
//	public List<Img> selectAllImg() throws Exception;
	//����  �ϴ�ʱ��  �����ѯ
//	public List<Img> selectAllImgGroupbyDate() throws Exception;
	//����  ������  �����ѯ
//	public List<Img> selectAllImgGroupbyFiledown() throws Exception;
	//��ѯ  ���������  ��ͼƬ(Ӧ���Ȳ�ѯ���ֵ��Ȼ���ڸ������ֵ��ѯ����ֹ����)
	public List<Img> selectImgByMaxFiledown() throws Exception;
	//����  ͼƬ����  ��ѯIMG (�����ж��ͼƬ��������ͬ��,,,���Ҵ˴�Ҫʹ��ģ����ѯ)
	public List<Img> selectImgByName(String img_name) throws Exception;
	//���� ����  ��ѯͼƬ
//	public List<Img> selectImgByType(int img_type_id) throws Exception;
	//����  ����ʱ��(day) ��ѯImg
	public List<Img> selectImgByDate(Date date) throws Exception;
	//����ID��ѯIMG
	public Img selectImgById(String img_id) throws Exception;
	
	//��ҳ��ѯ   1.���� ��2.����ʱ������ 3.��������;4.������       (��̬��ѯ)
	public List<Img> selectAllImgFY( Map<String,Integer> map ) throws Exception;
	public List<Img> selectAllImgGroupbyDateFY(Date date,int start,int size) throws Exception;
	public List<Img> selectImgByTypeFY(int img_type_id,int start,int size) throws Exception;
	public List<Img> selectAllImgGroupbyFiledownFY(int start,int size) throws Exception;
	
	
	/**
	 * ��ѯTYPEͼƬ����
	 * @return ͼƬ����
	 * @throws Exception
	 */
	//��ѯ���з���
	public List<Img_type> selectAllType(int start,int size) throws Exception;
	//��ѯ  ĳһ����  �ķ���(ͼƬ����ơ���ҳ��ͼƬ�µķ���)
	public List<Img_type> selectAllFirstType(int img_type_level,int start,int size) throws Exception;
	//���ݷ������ֲ�ѯ
	public Img_type selectTypeByName(String img_type_name,int start,int size) throws Exception;
	//����id���ֲ�ѯ����
	public Img_type selectTypeById(int img_type_id,int start,int size) throws Exception;
	
	
	/**
	 * ��ѯ�ϴ���¼
	 */
	//��ѯ���е��ϴ���¼
//	public List<Img_fileup> selectAllFileup() throws Exception;
	//��ҳ��ѯ
	public List<Img_fileup> selectAllFileupFY(int start,int size) throws Exception;
	
	
	/**
	 * ��ѯ���ؼ�¼
	 */
	//��ѯ���е����ؼ�¼
//	public List<Img_filedown> selectAllFiledown() throws Exception;
	//ʱ���ҳ
	public List<Img_filedown> selcetFiledownByDateFY(Date date) throws Exception;
	//��ҳ��ѯ
	public List<Img_filedown> selectAllFiledownFY(int start,int size) throws Exception;
	
	/**
	 * ɾ������
	 */
	//ɾ��ͼƬ
	public void deleteImg(int img_id) throws Exception;
	//����ϴ���¼���������󣬺������ߣ�
	//������ؼ�¼���������󣬺������ߣ�
	
}
