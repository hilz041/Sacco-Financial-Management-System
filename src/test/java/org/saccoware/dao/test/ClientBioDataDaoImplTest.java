package org.saccoware.dao.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertSame;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.saccoware.dao.ClientBioDataDaoImpl;
import org.saccoware.model.ClientBioData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientBioDataDaoImplTest {

	@Autowired
	ClientBioDataDaoImpl cltdao ;
	ClientBioData clt = new ClientBioData(2, "Lwanga Ahmed", "0755600025", "Rubaga", "Teacher", new Date());
	
	@Test
	public void testGetAllItems() {
		
		cltdao.addItem(clt);
		assertThat(cltdao.getAllItems().contains(1));
	}
	
	@Test
	public void testAddItem(){ 
		ClientBioData clt1 = new ClientBioData(2, "Magumba Frank", "0413332224", "Lugoba", "Doctor", new Date());
		cltdao.addItem(clt1);
		//ClientBioData x = cltdao.getItemById(2);
		//assertSame("Magumba Frank", x.getName());
		
		}

	@Test
	public void testUpdateItem(){
		ClientBioData clt = new ClientBioData(2, "Luba James", "0789000000", "Gulu", "Driver", new Date());
		cltdao.updateItem(clt);
		//ClientBioData t = cltdao.getItemById(2);
		//assertSame("Kaiso Geoga", t.getName());
	}
	//@Test
	public void testGetItemById(){
		//ClientBioData clt = new ClientBioData(3, "Kato Venancio", "031758695", "Kamuli", "Banker", new Date());
		ClientBioData clt = new ClientBioData();
		 clt = cltdao.getItemById(2);
		assertEquals("Luba James", clt.getName());
		
	}
	@Test
	public void testRemoveItem()  {
		ClientBioData clt = new ClientBioData(3, "Busukuma Grace", "0711656300", "Butambala", "Farmer", new Date());
		cltdao.addItem(clt);
		//cltdao.removeItem(2);
	}

	@Test
	public void testRemoveItemByName(){
		ClientBioData clt = new ClientBioData(4, "Atuhaire Pesh", "0756321523", "Kampala", "Accountant", new Date());
		cltdao.addItem(clt);
		//cltdao.removeItemByName("Busukuma Grace");
	}
	//@Test
	public void testRemoveAllItems(){
		cltdao.removeAllItems();
	}
}//end test class
