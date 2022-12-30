package com.felipe.IoC.Services;

import com.felipe.IoC.Repositories.BaseRepository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.synth.Region;

@Service
public class RegionService extends BaseService<Region>{
    private final RegionService regionService;

    public RegionService(BaseRepository<Region> baseRepository, RegionService regionService) {
        super(baseRepository);
        this.regionService = regionService;
    }
}
