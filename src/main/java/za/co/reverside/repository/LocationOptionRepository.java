
package za.co.reverside.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.co.reverside.domain.LocationOption;

@Repository
public interface LocationOptionRepository extends JpaRepository<LocationOption, Long> {
    
}
