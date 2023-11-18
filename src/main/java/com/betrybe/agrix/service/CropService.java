package com.betrybe.agrix.service;

import com.betrybe.agrix.exceptions.FarmNotFound;
import com.betrybe.agrix.model.entities.Crop;
import com.betrybe.agrix.model.entities.Farm;
import com.betrybe.agrix.model.repositories.CropRepository;
import com.betrybe.agrix.model.repositories.FarmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CropService {

  private CropRepository cropRepository;
  private FarmRepository farmRepository;
  private FarmService farmService;

  @Autowired
  public CropService(CropRepository cropRepository, FarmRepository farmRepository,
      FarmService farmService) {
    this.cropRepository = cropRepository;
    this.farmRepository = farmRepository;
    this.farmService = farmService;
  }

  public Crop createCrop(Crop crop, Integer id) throws FarmNotFound {
    Farm farm = farmService.getFarmById(id);
    
    crop.setFarm(farm);
    return cropRepository.save(crop);
  }
}
