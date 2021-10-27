package aaa.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class Alarmcontrol implements SubService2 {

	@Resource
	MyProvider myProvider;
	
	@Override
	public Object execute(String service) {


		AlarmControlService ss = myProvider.getContext().getBean(service, AlarmControlService.class);
		
		return ss.execute();
	}

}
