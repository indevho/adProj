package aaa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Storecontrol implements SubService2 {

	@Resource
	MyProvider myProvider;
	
	@Override
	public Object execute(String service) {


		StoreControlService ss = myProvider.getContext().getBean(service, StoreControlService.class);
		
		return ss.execute();
	}

}
