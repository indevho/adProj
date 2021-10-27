package aaa.service.sitecontrol;

import org.springframework.stereotype.Service;

import aaa.service.SiteControlService;

@Service
public class SiteMovieInfoControl implements SiteControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "유저웹관리_영화정보관리";
	}

	
}
