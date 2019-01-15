package ua.online.courses.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import ua.online.courses.entity.Item;
import ua.online.courses.service.ItemService;

@Controller
@SessionAttributes("item")
@RequestMapping("/item")//батьківським шляхом для всіх посилань на item
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	@GetMapping("/add")
	public String showCreateItemPage(Model model) {
		model.addAttribute("item", new Item());//для передачі на сервер даних
		return "item/add";
	}
	
	
	@PostMapping("/add")
	public String saveItem(@ModelAttribute("item")Item item) {		//зчитуємо з форми jsp слово item));
itemService.saveItem(item);//зберігаємо введені дані
		return "redirect:/item/list";
	}
	
	@GetMapping("/list")
	public String showListOfItems(Model model) {
		model.addAttribute("itemList", itemService.findAllItems());
		return "item/list";
	}
	
	@GetMapping("/{itemId}/edit")//item/23/edit
	public String editItem(Model model,@PathVariable("itemId") int id) {
		model.addAttribute("item", itemService.findItemById(id));
		return "item/edit";
	}
	
	@PostMapping("{itemId}/edit")
	public String saveEditedItem(@ModelAttribute("item") Item item) {
		itemService.saveItem(item);
		return "redirect:/item/list";
	}
	
	@GetMapping("/{itemId}/delete")
	public String deleteItemById(@PathVariable("itemId")int itemId) {
		itemService.deleteItem(itemId);
		
		return "redirect:/item/list";
	}
}
