package com.family.framework.customer.web;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.family.framework.customer.service.ICustomerService;
import com.family.framework.customer.vo.CustomerModel;


@Controller
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	private ICustomerService cuistomerService;
	
	@RequestMapping(value="toAdd",method=RequestMethod.GET)
	public String toAdd(){
		
		return "customer/add";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(@ModelAttribute("cm") CustomerModel cm){
		Date date = new Date(System.currentTimeMillis());
		cm.setRegistertime(String.valueOf(date));
		cuistomerService.create(cm);
		return "customer/success";
	}
	
	
	@RequestMapping(value="toUpdate/{customerUuid}",method=RequestMethod.GET)
	public String toUpdate(Model model,@PathVariable("customerUuid") int customerUuid){
		CustomerModel cm = cuistomerService.getByUuid(customerUuid);
		model.addAttribute("cm", cm);
		return "customer/update";
	}
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String post(@ModelAttribute("cm") CustomerModel cm){
		Date date = new Date(System.currentTimeMillis());
		cm.setRegistertime(String.valueOf(date));
		cuistomerService.update(cm);
		return "customer/success";
	}
	@RequestMapping(value="toDelete/{customerUuid}",method=RequestMethod.GET)
	public String toDelete(Model model,@PathVariable("customerUuid") int customerUuid){
		CustomerModel cm = cuistomerService.getByUuid(customerUuid);
		model.addAttribute("cm", cm);
		return "customer/delete";
	}
	@RequestMapping(value="delete",method=RequestMethod.POST)
	public String post(@RequestParam("uuid") int customerUuid){
		cuistomerService.delete(customerUuid);
		return "customer/success";
	}
	
	
	/*@RequestMapping(value="toList",method=RequestMethod.GET)
	public String toList(@ModelAttribute("wm")CustomerWebModel wm,Model model){
		CustomerQueryModel cqm = null;
		if(wm.getQueryJsonStr()==null || wm.getQueryJsonStr().trim().length()==0){
			cqm =  new CustomerQueryModel();
		}else{
			cqm = (CustomerQueryModel)JsonHelper.str2Object(wm.getQueryJsonStr(), CustomerQueryModel.class);
		}
		
		cqm.getPage().setNowPage(wm.getNowPage());
		if(wm.getPageShow() > 0){
			cqm.getPage().setPageShow(wm.getPageShow());
		}
		
		Page dbPage = ics.getByConditionPage(cqm);
		
		//
		model.addAttribute("wm", wm);
		model.addAttribute("page", dbPage);
				
		return "customer/list";
	}*/
	
	@RequestMapping(value="toList",method=RequestMethod.GET)//该方法的页面 相当于/struts配置文件
	    public ModelAndView toList()throws Exception{  
	        ModelAndView modelAndView = new ModelAndView();  
	        //调用service方法查询用户数据 
	       List<CustomerModel> customerModel = cuistomerService.getByCustomerId();
	        //将得到的用户列表内容添加到ModelAndView中  
	     modelAndView.addObject("customerModel",customerModel);  
	        //设置响应的jsp页面
	      modelAndView.setViewName("customer/list");  
	        return modelAndView;  
	    }  
}
