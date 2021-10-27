package aaa.service.sitecontrol;

import org.springframework.stereotype.Service;

import aaa.service.SiteControlService;

@Service
public class SiteNoticeControl implements SiteControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "유저웹관리_공지뉴스관리";
	}

	
}
