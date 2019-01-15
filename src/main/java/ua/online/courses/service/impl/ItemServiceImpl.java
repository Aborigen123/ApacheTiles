package ua.online.courses.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.online.courses.entity.Item;
import ua.online.courses.repository.ItemRepository;
import ua.online.courses.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public void saveItem(Item item) {
		
		itemRepository.save(item);
	}

	@Override
	public List<Item> findAllItems() {
		
		return itemRepository.findAll();
	}

	@Override
	public Item findItemById(int id) {
	
		return itemRepository.findOne(id);
	}

	@Override
	public void deleteItem(int id) {
	itemRepository.delete(id);
		
	}

	@Override
	public Item findItemByName(String name) {
		
		return itemRepository.findItemByName(name);
	}

}
