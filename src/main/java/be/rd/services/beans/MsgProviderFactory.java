package be.rd.services.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

public class MsgProviderFactory implements FactoryBean<IMsgProvider>,
		InitializingBean {

	private String type;
	private IMsgProvider msgProvider;
		
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		if("surf".equals(type)){
			msgProvider = new SurfMsgProvider();
		}else{
			msgProvider = new SnowMsgProvider();
		}
	}

	@Override
	public IMsgProvider getObject() throws Exception {
		return msgProvider;
	}

	@Override
	public Class<?> getObjectType() {
		return IMsgProvider.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
