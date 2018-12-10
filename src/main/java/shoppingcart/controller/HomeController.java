package shoppingcart.controller;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import shoppingcart.entity.Item;
import shoppingcart.entity.ShoppingList;
import shoppingcart.entity.Store;
import shoppingcart.service.StoreService;

@Controller
public class HomeController {
	@Autowired
	StoreService storeService;
	
	
	@RequestMapping(value = "/home", method = RequestMethod.GET) 
	public String home() {  
	    return "home"; 
	}
	@RequestMapping(value = "/addstore", method = RequestMethod.GET) 
	public String addstore() {  
	    return "addstore"; 
	}
	@RequestMapping(value = "/addstore", method = RequestMethod.POST)
	public String addstore1(@RequestParam("storename") String storename,@RequestParam("telno") String telno,@RequestParam("location") String location,@RequestParam("workinghours") String workinghours,@RequestParam("weeklyholiday") String weeklyholiday)
	{
		Store store = new Store(storename, telno, location, workinghours, weeklyholiday);
		System.out.println(store);
		storeService.createStore(store);
		return "addstore";
	}
	
	@RequestMapping(value = "/displaystore", method = RequestMethod.GET) 
	public ModelAndView displaystore()
	{
		ModelAndView mv = new ModelAndView("displaystore", "displaystore", new Store());
		mv.addObject("STORELIST", storeService.getAllStore());
		return mv;		
	}
	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	public String additem(@RequestParam("itemname") String itemname,@RequestParam("quantity") String quantity,@RequestParam("purbydate") String purbydate)
	{
		Item item = new Item(itemname, quantity, purbydate);
		System.out.println(item);
		storeService.createItem(item);
		return "home";
	}
	@RequestMapping(value = "/addshoppinglist", method = RequestMethod.GET)
	public ModelAndView addshoppinglist()
	{
		ModelAndView mv = new ModelAndView("addshoppinglist", "addshoppinglist", new ShoppingList());
		Map<Long, String> mmMap = storeService.getAllItem().stream().collect(Collectors.toMap(Item :: getId, Item :: getItemname));
		mv.addObject("ITEMLIST",mmMap);
		Map<Long, String> mmMap1 = storeService.getAllStore().stream().collect(Collectors.toMap(Store :: getId, Store :: getName));
		mv.addObject("STORELIST",mmMap1);
		return mv;
	}
	
	@RequestMapping(value = "/addshoppinglist", method = RequestMethod.POST)
	public String addshoplist(@RequestParam("storename") String storename)
	{
		System.out.println(storename);
		return "addshoppinglist";
	}
	@RequestMapping(value = "/displayitem", method = RequestMethod.GET) 
	public ModelAndView displayitem()
	{
		ModelAndView mv = new ModelAndView("displayitem", "displayitem", new Item());
		mv.addObject("ITEMLIST", storeService.getAllItem());
		return mv;		
	}
	
	
}
