package org.example.hazards.controller;

import org.example.hazards.model.Hazards;
import org.example.hazards.service.HazardService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HazardController {

    private HazardService service;

    public HazardController(HazardService service) {
        this.service = service;
    }

    @GetMapping("/hazards")
    public Hazards getHazards() {
        return service.getHazards();
    }

    @GetMapping("/hazards/max")
    public double getMaxMagnitude() {
        return service.getMaxMagnitude();
    }

    @GetMapping("/hazards/average")
    public double getAverageMagnitude() {
        return service.getAverageMagnitude();
    }

}
