package aaa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Salescontrol implements SubService2 {

	@Resource
	MyProvider myProvider;
	
	@Override
	public Object execute(String service) {


		SalesControlService ss = myProvider.getContext().getBean(service, SalesControlService.class);
		
		return ss.execute();
	}

}
