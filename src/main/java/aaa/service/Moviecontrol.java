package aaa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Moviecontrol implements SubService2 {

	@Resource
	MyProvider myProvider;
	
	@Override
	public Object execute(String service) {


		MovieControlService ss = myProvider.getContext().getBean(service, MovieControlService.class);
		
		return ss.execute();
	}

}
