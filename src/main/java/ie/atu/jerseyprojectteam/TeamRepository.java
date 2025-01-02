package ie.atu.jerseyprojectteam;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.plaf.synth.Region;
import java.util.List;

public interface TeamRepository extends JpaRepository<Teams, Long> {
    List<Teams> findByRegionId(Long regionId);
}
