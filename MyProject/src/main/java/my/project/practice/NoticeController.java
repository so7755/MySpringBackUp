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
//		메소드가 String 형식이면 return으로 원하는 jsp 파일 이름으로 보내줄 수 있다
//		void type이라면 그냥 value의 값으로 페이지 이동한다
		logger.info("noticeAll page call"); //static으로 Logger를 선언해둬야 한다
		
		
		model.addAttribute("listall", noticeDAO.listAll());
		
		
		
		
	}

	
	
}
