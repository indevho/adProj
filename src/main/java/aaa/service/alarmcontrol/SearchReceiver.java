package aaa.service.alarmcontrol;

import org.springframework.stereotype.Service;

import aaa.service.AlarmControlService;

@Service
public class SearchReceiver implements AlarmControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "알림전송_대상자찾기";
	}

	
}
