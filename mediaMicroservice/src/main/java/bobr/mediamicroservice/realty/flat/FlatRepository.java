package bobr.mediamicroservice.realty.flat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FlatRepository extends JpaRepository<Flat, Integer> {
}
