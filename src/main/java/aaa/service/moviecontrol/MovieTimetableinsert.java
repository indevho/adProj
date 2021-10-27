package aaa.service.moviecontrol;

import org.springframework.stereotype.Service;

import aaa.service.MovieControlService;
import aaa.service.SalesControlService;
import aaa.service.SiteControlService;

@Service
public class MovieTimetableinsert implements MovieControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "영화시간표_등록화면";
	}

	
}
