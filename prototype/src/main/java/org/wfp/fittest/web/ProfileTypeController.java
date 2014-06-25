package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.entity.ProfileType;
import org.wfp.fittest.service.StaffService;

@Controller
public class ProfileTypeController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileTypeController.class);
	
	@Autowired
	private StaffService staffService;
	
	@RequestMapping(value = "/profiletype", method = RequestMethod.GET)
	public String profileType(Locale locale, Model model) {
		logger.info("Profile Type Page!", locale);
		List<ProfileType> profileTypes = staffService.findAllProfileTypes();
		model.addAttribute("profileTypes", profileTypes);
		return "profiletype";
	}
}
