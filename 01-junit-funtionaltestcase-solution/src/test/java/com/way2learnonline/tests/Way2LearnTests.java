package com.way2learnonline.tests;

import org.junit.Assert;
import org.junit.Test;
import org.mule.DefaultMuleMessage;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.client.MuleClient;
import org.mule.tck.junit4.FunctionalTestCase;

public class Way2LearnTests  extends FunctionalTestCase{
	
	
	@Test
	public void testFlow() throws Exception{
		MuleClient muleClient= muleContext.getClient();
		DefaultMuleMessage message= new DefaultMuleMessage(null, muleContext);
		
		MuleMessage responseMessage=
				muleClient.send("http://localhost:8081/test?username=siva", message);
		
		Object responsePayload=responseMessage.getPayloadAsString();
		Assert.assertEquals("hellosiva", responsePayload);
	}
	

	@Override
	protected String[] getConfigFiles() {
		return new String[]{"src/main/app/testflow.xml"};
	}

}
