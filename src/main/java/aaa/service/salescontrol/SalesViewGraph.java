package aaa.service.salescontrol;

import org.springframework.stereotype.Service;

import aaa.service.SalesControlService;
import aaa.service.SiteControlService;

@Service
public class SalesViewGraph implements SalesControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "매출정산_그래프보기";
	}

	
}
