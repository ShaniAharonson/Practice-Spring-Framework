package com.donation.exercise.Controller;

import com.donation.exercise.Exceptions.DonateSystemException;
import com.donation.exercise.Service.DonateService;
import com.donation.exercise.beans.Donation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@CrossOrigin
public class DonateController {
    private final DonateService donateService;

    @PostMapping("/add_donation")
    @ResponseStatus(HttpStatus.CREATED)
    public void addDonation(@RequestBody Donation donate) throws Exception {
        donateService.addDonation(donate);
    }

    @GetMapping("/list_under_180/{amount}")
    @ResponseStatus(HttpStatus.OK)
    public List<Donation> donationsUnder_180(@PathVariable int amount) throws Exception {
        return donateService.donationsUnder_180(amount);
    }

    @GetMapping("/list_more_1800/{amount}")
    @ResponseStatus(HttpStatus.OK)
    public List<Donation> donationsMoreThan_1800(@PathVariable int amount) throws Exception {
        return donateService.donationsMoreThan_1800(amount);
    }

    @GetMapping("/all_donations")
    public List<Donation> getAllDonation() {
        return donateService.getAllDonation();
    }

    @GetMapping("/by_name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<Donation> getDonationByName(@PathVariable String name) throws DonateSystemException {
        return donateService.getDonationByName(name);
    }
}
