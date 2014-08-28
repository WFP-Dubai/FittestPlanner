package org.wfp.fittest.web;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wfp.fittest.dto.EventDto;

@Controller
@RequestMapping(value = "/event")
public class EventController extends AbstractController {

	@RequestMapping(value = "")
	public String event(Model model, Locale locale) {
		model.addAttribute("allEvents", activityService.findAllEvents());
		return "event";
	}
	
	@RequestMapping(value = "/new")
	public String eventNew(Model model, Locale locale) {
		model.addAttribute("event", new EventDto());
		return "forms/event";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String eventSave(@ModelAttribute EventDto eventDto, Model model, Locale locale) {
		activityService.saveOrUpdateEvent(eventDto);
		return "redirect:/event";
	}

	@RequestMapping(value = "/{id}/view")
	public String eventView(@PathVariable("id") Long eventId, Model model,
			Locale locale) {
		model.addAttribute("event", activityService.findEventNested(eventId));
		return "forms/event";
	}

	@RequestMapping(value = "/{id}/delete", method = RequestMethod.POST)
	public String eventDelete(@PathVariable("id") Long eventId, Model model,
			Locale locale) {
		activityService.deleteEventById(eventId);
		return "redirect:/event";
	}
}
