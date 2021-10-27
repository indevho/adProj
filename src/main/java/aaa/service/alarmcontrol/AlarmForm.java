package aaa.service.alarmcontrol;

import org.springframework.stereotype.Service;

import aaa.service.AlarmControlService;

@Service
public class AlarmForm implements AlarmControlService{

	@Override
	public Object execute() {
		// TODO Auto-generated method stub
		return "알림전송_알람내용입력";
	}

	
}
