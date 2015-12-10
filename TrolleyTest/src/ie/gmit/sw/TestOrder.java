package ie.gmit.sw;

import org.junit.*;
import static org.junit.Assert.*;

public class TestOrder {
	
	private Order order = null;
	
	@Before
	public void setup(){//set up the test fixture
		order = new Order();
	}
	 @After
	public void tearDown(){
		order = null;
	}
	 
	 @Test
	 public void validOrderNumber() throws Exception{
		 order.setOrderNumber("AA-123-B9");
		 assertNotNull(order.getOrderNumber());
	 }

	 @Test
	 public void nullOrderNumber()throws Exception{
		 order.setOrderNumber(null);
		 
	 }
	 
	 @Test
	 public void addValidLineItem(){
		 int count = order.itemCount();
		order.addItem("A-123-B9", "Bam", 12, 12.56); 
		assertTrue(order.itemCount() == count + 1);
	 }
}
