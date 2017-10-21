package action;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.SessionScope;

import entity.Admin_im;
import iservice.IAdminService;

@Controller
@RequestMapping(value="/admin")
public class AdminAction{
	
	@Resource
	private IAdminService adminService;
	public void setAdminService(IAdminService adminService) {
		this.adminService = adminService;
	}
	
	/**
	 * 登陆login验证
	 * @param username	用户名
	 * @param password	密码
	 * @param session	存储登陆状态
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/login")
	public String add(String username,
			String password,
			HttpSession session) 
					throws Exception{
		Admin_im admin_im = adminService.login(username, password);
		System.out.println(111111111);
		if(admin_im == null){
			return "/noname.html";
		}else{
			List<String> urlList = adminService.selectAllUrlByAdmin_action(admin_im.getAdmin_action().getAdmin_action_id());
			System.out.println(urlList);
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			session.setAttribute("urlList", urlList);
			
			//还应该将用户所在的权限集存储到session中（但此种方法不是很安全）
			//session.setAttribute("authority", authority_url);
			return "/success.jsp";
		}
		
	}
	@RequestMapping(value="/find")
	public String find(Model model) throws Exception{
		model.addAttribute("message", "find");
		return "/success.jsp";
	}
}