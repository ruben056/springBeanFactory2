package be.rd.services.beans;

import org.springframework.stereotype.Service;
import javax.annotation.*;

@Service("echoBean")
public class Echo implements IEcho {
	
	@Resource(name="snowEcho")
	private IMsgProvider surfMsgProvider;
	private IMsgProvider snowMsgProvider;
	
	public void setSurfMsgProvider(IMsgProvider surfMsgProvider) {
		this.surfMsgProvider = surfMsgProvider;
	}
	
	public void setSnowMsgProvider(IMsgProvider snowMsgProvider) {
		this.snowMsgProvider = snowMsgProvider;
	}
	
	@Override
	public void echo() {
		System.out.println("surfMsgProvider: " + surfMsgProvider.getMsg());
		System.out.println("snowMsgProvider: " + snowMsgProvider.getMsg());
	}

}
