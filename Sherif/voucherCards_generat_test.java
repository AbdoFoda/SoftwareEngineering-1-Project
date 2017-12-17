import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;


class voucherCards_generat_test {

	@Test
	void test() {
		AdminHomePage.provideVoucherCard();
		HashSet<String> s=new  HashSet<String>();
		for(int i=0;i<DataBase.Virtual_DB.voucherCards.size();i++)
    	{
			s.add(DataBase.Virtual_DB.voucherCards.get(i).getSerialNum());
    	}
		assertEquals(100, s.size());//all voucherCards are distinct
		
	}
	

}
