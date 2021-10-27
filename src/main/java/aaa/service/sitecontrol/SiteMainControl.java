package aaa.service.sitecontrol;

import org.springframework.stereotype.Service;

import aaa.service.SiteControlService;

@Service
public class SiteMainControl implements SiteControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "페이지관리_메인";
	}

	
}
