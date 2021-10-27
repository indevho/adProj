package aaa.control;

import java.util.ArrayList;
import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.model.AdmUrlData;
import aaa.model.Menu;
import aaa.service.MyProvider;
import aaa.service.SubService2;

@Controller 
@RequestMapping("admin/{cate}/{service}")
public class AdminController {
	@Resource
	MyProvider myProvider;
	
	@ModelAttribute()
	AdmUrlData admUrlData(@PathVariable String cate, @PathVariable String service) {
		System.out.println(new AdmUrlData(cate, service));
		return new AdmUrlData(cate, service);
		
	}

	
	@ModelAttribute("mainData")
	Object mainDataC(@PathVariable String cate, @PathVariable String service) {
		
		if(service!=null&&!service.equals("")) {
		SubService2 ss = myProvider.getContext().getBean(cate, SubService2.class);
		return ss.execute(service);
		}else {
			return null;
		}
	}
	
	@ModelAttribute("subMenu")
	ArrayList<Menu> subMenu(@PathVariable String cate, @PathVariable String service) {
		
		HashMap<String, ArrayList<Menu>>map = new HashMap<>();
		
		map.put("alarmcontrol", new ArrayList<Menu>());
		map.put("moviecontrol", new ArrayList<Menu>());
		map.put("salescontrol", new ArrayList<Menu>());
		map.put("sitecontrol", new ArrayList<Menu>());
		map.put("storecontrol", new ArrayList<Menu>());
		map.get("alarmcontrol").add(new Menu("alarmForm","알림 전송하기"));
		map.get("alarmcontrol").add(new Menu("searchReceiver"," 체크해서 멀티 전송"));
		map.get("moviecontrol").add(new Menu("movieTimetableinsert","시간표에 등록하기"));
		map.get("moviecontrol").add(new Menu("movieTimetableModify","시간표 수정하기"));
		map.get("moviecontrol").add(new Menu("movieTimetableView","시간표 조회하기"));
		map.get("salescontrol").add(new Menu("salesViewByCate","카테고리별 매출조회"));
		map.get("salescontrol").add(new Menu("salesViewByPeriod","기간선택 매출조회"));
		map.get("salescontrol").add(new Menu("salesViewGraph","그래프 시각화"));
		map.get("sitecontrol").add(new Menu("siteEventControl","이벤트관리"));
		map.get("sitecontrol").add(new Menu("siteMainControl","메인페이지관리"));
		map.get("sitecontrol").add(new Menu("siteMovieInfoControl","영화정보 관리"));
		map.get("sitecontrol").add(new Menu("siteNoticeControl","공지/뉴스 관리"));

		return map.get(cate);
	}

	@RequestMapping
	String view() {
		System.out.println("뷰단으로 넘어갑니다. ");
		return "admin/tem/main";
	}
	

}
