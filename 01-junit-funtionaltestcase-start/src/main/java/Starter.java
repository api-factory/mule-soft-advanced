import org.mule.api.MuleContext;
import org.mule.api.config.ConfigurationException;
import org.mule.config.spring.SpringXmlConfigurationBuilder;
import org.mule.context.DefaultMuleContextFactory;

public class Starter {

	public static void main(String[] args) throws Exception {
		
		
		DefaultMuleContextFactory muleContextFactory = new DefaultMuleContextFactory();
		
		SpringXmlConfigurationBuilder configBuilder = new SpringXmlConfigurationBuilder("testflow.xml");
		
		
		MuleContext muleContext = muleContextFactory.createMuleContext(configBuilder);
		
		muleContext.start();
		
		System.out.println("Flow Started....");
		
		

	}

}
