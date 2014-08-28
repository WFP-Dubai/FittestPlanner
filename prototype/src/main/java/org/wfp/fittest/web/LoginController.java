package org.wfp.fittest.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.LoginDto;
import org.wfp.fittest.service.LdapService;

@Controller
public class LoginController extends AbstractController {
	
	@Autowired
	private LdapService ldapService;
	
	@RequestMapping(value = "/login")
	public String login(Model model, Locale locale) {
		model.addAttribute("loginDetails", new LoginDto());
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpServletRequest request, Model model, Locale locale) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		session.removeAttribute("admin");
		session.invalidate();
		return "redirect:/login";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute LoginDto loginDetails,
			Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		String username = loginDetails.getUsername();
		String password = loginDetails.getPassword();
		String token = ldapService.validate(username, password);

		if (token != null) {
			session.setMaxInactiveInterval(15 * 60);
			session.setAttribute("user", username);
			session.setAttribute("name", ldapService.getLoggedInUserName(token, username));
			session.removeAttribute("loginErrorMessage");
			if (ldapService.isTrackerAdmin(token, username)) {
				session.setAttribute("admin", username);
			}
			else {
				session.setAttribute("readOnly", true);
			}
			return "redirect:/dashboard";
		} else {
			session.setAttribute("loginErrorMessage",
					"Invalid login details. Please enter a correct username or password.");
			return "redirect:/login";
		}
	}
}
