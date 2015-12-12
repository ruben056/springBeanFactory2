package be.rd.services.beans;

import org.springframework.stereotype.Component;

@Component("snowEcho")
public class SnowMsgProvider implements IMsgProvider {

	@Override
	public String getMsg() {
		return "Powderdaaaay!";
	}

}
