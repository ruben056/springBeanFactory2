package be.rd.services;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.rd.services.beans.IEcho;
import be.rd.services.beans.MsgProviderFactory;

public class AppContextMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext(
				"app-context.xml");
		appCtx.getBean("echoBean", IEcho.class).echo();
		
		//access factory bean itself (not the bean it creates)
		System.out.println(appCtx.getBean("&surfMsgProvider", MsgProviderFactory.class).getObjectType());
		
		
		appCtx.close();
	}

}
