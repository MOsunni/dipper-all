package entity;

import java.util.Date;

/**
 * 图片上传时间、作者
 * @author 46098
 */
public class Img_fileup {
	
	private int img_fileup_id;
	//上传时间
	private Date img_fileup_time;
	//上传的管理员
	private int admin_id;
	
	public Img_fileup(){}

	public int getImg_fileup_id() {
		return img_fileup_id;
	}

	public void setImg_fileup_id(int img_fileup_id) {
		this.img_fileup_id = img_fileup_id;
	}

	public Date getImg_fileup_time() {
		return img_fileup_time;
	}

	public void setImg_fileup_time(Date img_fileup_time) {
		this.img_fileup_time = img_fileup_time;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	};
	
}
