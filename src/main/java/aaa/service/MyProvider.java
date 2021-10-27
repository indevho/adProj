package aaa.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

//보자마자 컴포넌트 걸어주세요
@Component
public class MyProvider implements ApplicationContextAware {
/*Indicates that an annotated class is a "component".
 * Such classes are considered as candidates
 *  for auto-detectionwhen using
 *   annotation-based configuration 
 *   and classpath scanning. 	}
	
 * */
	
	ApplicationContext context;
	
	//밖에서 컴포넌트인 마이프로바이더 불러서 꺼내올수단
	public ApplicationContext getContext() {
		return context;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("나는 라이프사이클 과정에서 실행함~ApplicationContextAware구현중.");
		context = applicationContext;

	}

}
