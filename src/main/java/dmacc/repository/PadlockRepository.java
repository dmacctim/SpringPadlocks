package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Padlock;

/**  
* @author Tim Ancona - tsancona  
* CIS175 - Spring 2022
* Mar 10, 2022  
*/
@Repository
public interface PadlockRepository extends JpaRepository<Padlock, Long> {
	
}
