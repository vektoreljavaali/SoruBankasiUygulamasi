package util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns= {"/AdminPanel","/Users"})
public class LoginFilter implements Filter{

	
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		try {
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse res = (HttpServletResponse)response;
			
			HttpSession session = req.getSession(false);
			String urlmap = req.getRequestURI();
			
			if(urlmap.indexOf("/AdminPanel")>=0) {
				res.sendRedirect(req.getContextPath()+"/AdminPanel/index.xhtml");
			}
			else if(urlmap.indexOf("/Users")>=0)
			{
				res.sendRedirect(req.getContextPath()+"/Users/index.xhtml");
				
			}
			else {
				
				res.sendRedirect(req.getContextPath()+"/default.xhtml");
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
