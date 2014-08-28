package org.wfp.fittest.web;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.ProfileTypeDto;
import org.wfp.fittest.service.StaffService;

@Controller
@RequestMapping(value = "/profileType")
public class ProfileTypeController {

	@Autowired
	private StaffService staffService;

	@RequestMapping(value = "")
	public String profileType(Model model, Locale locale) {
		List<ProfileTypeDto> profileTypes = staffService.findAllProfileTypes();
		model.addAttribute("allProfileTypes", profileTypes);
		return "profileType";
	}

	@RequestMapping(value = "/new")
	public String profileTypeNew(Model model, Locale locale) {
		model.addAttribute("profileType", new ProfileTypeDto());
		return "forms/profile-type";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String profileTypeSave(@ModelAttribute ProfileTypeDto profileType,
			Model model, Locale locale) {
		staffService.saveOrUpdateProfileType(profileType);
		return "redirect:/profileType";
	}

	@RequestMapping(value = "/{id}/view")
	public String profileTypeView(@PathVariable("id") Long id, Model model,
			Locale locale) {
		model.addAttribute("profileType",
				staffService.findProfileTypeNested(id));
		return "forms/profile-type";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String profileTypeDelete(@PathVariable("id") Long id, Model model,
			Locale locale) {
		staffService.deleteProfileTypeById(id);
		return "redirect:/profileType";
	}
}
