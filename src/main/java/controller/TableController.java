package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DAO.selectDAO;
import DTO.RequestDTO;
import DTO.ResponseDTO;
import model.CategoryT;

@Controller
public class TableController
{
	@Autowired
	private selectDAO dao;
	@RequestMapping( value="/", method = RequestMethod.GET )
	public ModelAndView Choice(ModelMap model)
	{
		List<ResponseDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return new ModelAndView("ShowCategory", "cate" , new CategoryT());
	}

	@RequestMapping( value="/select" , method = RequestMethod.POST )
	public String SelectProduct(@ModelAttribute("cate") CategoryT cate , ModelMap model )
	{
		RequestDTO dto = new RequestDTO();
		dto.setCategoryId(cate.getCategoryId());
		List<ResponseDTO> list = dao.selectOne(dto);
		model.addAttribute("list", list);
		return "showPage";
	}
}
