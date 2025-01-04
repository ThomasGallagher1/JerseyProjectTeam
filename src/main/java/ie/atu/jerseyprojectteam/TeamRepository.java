package ie.atu.jerseyprojectteam;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.plaf.synth.Region;
import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Teams, Long> {
    List<Teams> findByRegionId(Long regionId);
}
