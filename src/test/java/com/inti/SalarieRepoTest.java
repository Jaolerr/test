package com.inti;

import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.inti.model.Salarie;
import com.inti.repo.SalarieRepo;

@ExtendWith(SpringExtension.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=AutoConfigureTestDatabase.Replace.NONE)
public class SalarieRepoTest {
	
	@Autowired
	SalarieRepo isr;
	
	public void setUp() {
		Salarie s = new Salarie();
	}
	
	public void insertionSalarie() {
		
	}

}
