package org.saccoware.service.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.saccoware.model.ClientBioData;
import org.saccoware.service.ClientBioDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientBioDataServiceImplTest {

	@Autowired
	ClientBioDataServiceImpl ctdao;
ClientBioData clt = new ClientBioData(8, "Agazo Christine", "0756321654", "Arua", "Home Keeper", new Date());
	
	@Test
	public void testGetAllItems() {
		
		ctdao.addItem(clt);
		assertThat(ctdao.getAllItems().contains(1));
	}
	
	@Test
	public void testAddItem(){ 
		ClientBioData clt1 = new ClientBioData(2, "Kajumba Jeff", "041333586", "Kajjansi", "Builder", new Date());
		ctdao.addItem(clt1);
		//ClientBioData x = cltdao.getItemById(2);
		//assertSame("Magumba Frank", x.getName());
		
		}

	//@Test
	public void testUpdateItem(){
		ClientBioData clt = new ClientBioData(4, "Kasekende John", "3012657459", "Masaka", "Trader", new Date());
		ctdao.updateItem(clt);
		//ClientBioData t = cltdao.getItemById(2);
		//assertSame("Kaiso Geoga", t.getName());
	}
	//@Test
	public void testGetItemById(){
		//ClientBioData clt = new ClientBioData(3, "Kato Venancio", "031758695", "Kamuli", "Banker", new Date());
		ClientBioData clt = new ClientBioData();
		 clt = ctdao.getItemById(4);
		assertEquals("Luba James", clt.getName());
		
	}
	@Test
	public void testRemoveItem()  {
		ClientBioData clt = new ClientBioData(6, "Rutamaguzi John Rogers", "0772654987", "Mukono", "Farmer", new Date());
		ctdao.addItem(clt);
		//cltdao.removeItem(2);
	}

	@Test
	public void testRemoveItemByName(){
		ClientBioData clt = new ClientBioData(4, "Odong James", "0777258741", "Nakapiripirit", "Engineer", new Date());
		ctdao.addItem(clt);
		//cltdao.removeItemByName("Busukuma Grace");
	}
	//@Test
	public void testRemoveAllItems(){
		ctdao.removeAllItems();
	}
}//end test class
