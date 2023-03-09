import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.MockitoJUnitRunner;

import com.demo.CalculateService;
import com.demo.MainApplication;

//import junit.framework.Assert;

@RunWith(MockitoJUnitRunner.class) 
public class MainApplicationTest
{

	//@InjectMocks annotation isused to create and inject the mock object 

	@InjectMocks

	MainApplication mathApplication = new MainApplication();
	//@Mock annotation is used to create the mock object to be injected 
	@Mock
   CalculateService calcService;

	@Test

	public void testAdd(){

	//add the behavior of calcservice to add two numbers

	when(calcService.add(10.0,20.0)).thenReturn(30.0);

	//test the add functionality

	Assert.assertEquals(mathApplication.add(10.0,20.0),30.0,0); 
	}


}
