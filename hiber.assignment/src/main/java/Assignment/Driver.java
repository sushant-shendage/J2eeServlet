package Assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	static EntityManager em = emf.createEntityManager();
	static EntityTransaction et = em.getTransaction();
	static Bank77 bank=new Bank77();
	static List<Account77> accounts=new ArrayList<>();
	static Query q=em.createQuery("select b from Bank b");
	

	public static void main(String[] args) {
		insertBankRecordByBankId(88, "bank88", "loc88");
		//updateBankRecordByBankId(11,"bank11new");
		//deleteBankRecordById(11);
//		fetchBankrecordByBankId(22);
//		fetchAll();
	}
	
//	static void fetchAll() {
//	List <Bank77> banks=q.getResultList();
//	
//	for (Bank77 i : banks) {
//		System.out.println("bank id       ::"+i.getId());
//		System.out.println("bank name     ::"+i.getName());
//		System.out.println("bank location ::"+i.getLocation());
//		System.out.println("------------------------------------------");
//	}
	
//	}
	
	static void deleteAccountByBankId(int id) {
		if(em.find(Bank77.class, id)==null) {
//			System.out.println("id is not present");
//		}else {
//			System.out.println("id is already present..!");
//			bank=em.find(Bank77.class, id);
//			Account77 acc=bank.ge
//			acc=em.find(Bank77.class, id);
//			 
//			
//			 System.out.println("bank id       ::"+bank.getId());
//			 System.out.println("bank name     ::"+bank.getName());
//			 System.out.println("bank location ::"+bank.getLocation());
//

			System.out.println("Bank record deleted successfully..!");

		}
	}
	
	static void fetchBankrecordByBankId(int id) {
		if(em.find(Bank77.class, id)==null) {
			System.out.println("id is not present");
		}else {
			System.out.println("id is already present..!");
			bank=em.find(Bank77.class, id);
			 
			
			 System.out.println("bank id       ::"+bank.getId());
			 System.out.println("bank name     ::"+bank.getName());
			 System.out.println("bank location ::"+bank.getLocation());


			System.out.println("Bank record deleted successfully..!");

		}
	}
	
 	static void deleteBankRecordById(int id) {
		if(em.find(Bank77.class, id)==null) {
			System.out.println("id is not present");
			 
			
			 
			
		}else {
			System.out.println("id is already present..!");
			bank=em.find(Bank77.class, id);
			 
			
			et.begin();
			em.remove(bank);
			et.commit();
			System.out.println("Bank record deleted successfully..!");

		}
	}
 	static void updateBankRecordByBankId(int id,String newName) {
		if(em.find(Bank77.class, id)==null) {
			System.out.println("id is not present");
			 
			
			 
			
		}else {
			System.out.println("id is already present..!");
			bank=em.find(Bank77.class, id);
			bank.setName(newName);
			
			et.begin();
			em.merge(bank);
			et.commit();
			System.out.println("Bank record updated successfully..!");

		}
	}
	static void insertBankRecordByBankId(int id, String name, String location) {
		if(em.find(Bank77.class, id)==null) {
			System.out.println("id is not present");
			bank.setId(id);
			bank.setName(name);
			bank.setLocation(location);
			
			et.begin();
			em.persist(bank);
			et.commit();
			
			System.out.println("Bank record saved successfully..!");
			
		}else {
			System.out.println("id is already present..!");
		}
	}
}
