package aaa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Sitecontrol implements SubService2 {

	@Resource
	MyProvider myProvider;
	
	@Override
	public Object execute(String service) {


		SiteControlService ss = myProvider.getContext().getBean(service, SiteControlService.class);
		
		return ss.execute();
	}

}
