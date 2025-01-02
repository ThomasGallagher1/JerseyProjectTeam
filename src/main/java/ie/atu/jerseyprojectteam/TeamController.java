package ie.atu.jerseyprojectteam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("/region/{regionId}")
    public List<Teams> getTeamsByRegion(@PathVariable Long regionId){
        return teamRepository.findByRegionId(regionId);
    }
}
