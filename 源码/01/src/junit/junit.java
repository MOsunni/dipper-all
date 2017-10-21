package junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class junit {
	
//	private static ApplicationContext applicationContext;
	
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/bean-base.xml");
		System.out.println(applicationContext);
		/*AdminMapper adminMapper =(AdminMapper) applicationContext.getBean("adminMapper");
		List<Admin_im> adminList = adminMapper.selectAllAdmin();
		for(Admin_im admin_im:adminList){
			System.out.println(admin_im.getAdmin_name());
		}*/
	}
	
}
