package ua.online.courses.service;

import java.util.List;

import ua.online.courses.entity.Item;

public interface ItemService  {

	void saveItem(Item item);
	
	List<Item> findAllItems();
	
	Item findItemById(int id);
	
	void deleteItem(int id);
	
	Item findItemByName(String name);
}
