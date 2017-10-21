package action;

import javax.annotation.Resource;
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
	
	@RequestMapping(value="/login")
	public String add(String username,String password,HttpSession session) throws Exception{
		Admin_im admin_im = adminService.login(username, password);
		System.out.println(111111111);
		if(admin_im == null){
			return "/noname.html";
		}else{
			session.setAttribute("username", username);
			session.setAttribute("password", password);
			return "/success.jsp";
		}
		
	}
	@RequestMapping(value="/find")
	public String find(Model model) throws Exception{
		model.addAttribute("message", "find");
		return "/success.jsp";
	}
}