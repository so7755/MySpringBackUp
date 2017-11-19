package my.project.practice;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.project.persistence.NoticeDAO;

@Controller
public class NoticeController {

	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
	@Inject 
	private NoticeDAO noticeDAO;
	
	@RequestMapping(value = "/noticeAll", method=RequestMethod.GET)
	public void noticeAll(Model model) throws Exception{
//		�޼ҵ尡 String �����̸� return���� ���ϴ� jsp ���� �̸����� ������ �� �ִ�
//		void type�̶�� �׳� value�� ������ ������ �̵��Ѵ�
		logger.info("noticeAll page call"); //static���� Logger�� �����ص־� �Ѵ�
		
		
		model.addAttribute("listall", noticeDAO.listAll());
		
		
		
		
	}

	
	
}
