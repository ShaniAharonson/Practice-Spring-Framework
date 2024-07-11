package com.donation.exercise.clr;

import com.donation.exercise.Service.DonateService;
import com.donation.exercise.beans.Donation;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@@Component
@Order(1)
@RequiredArgsConstructor
public class DonateTest implements CommandLineRunner {
    private final DonateService donateService;

    @Override
    public void run(String... args) throws Exception {
        try {
            Donation donate1 = Donation.builder()
                    .id(0)
                    .name("donate1")
                    .donationAmount(95)
                    .blessing("thank you!!!")
                    .build();
            Donation donate2 = Donation.builder()
                    .id(0)
                    .name("donate2")
                    .donationAmount(2000)
                    .blessing("You are so kind!!!")
                    .build();
//            donateService.addDonation(donate1);
//            donateService.addDonation(donate2);
            System.out.println("donation are added!");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        try {
//            donateService.getAllDonation().forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
//            System.out.println(donateService.donationsUnder_180(179));
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        try {
//            System.out.println(donateService.donationsMoreThan_1800(1801));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("by name: "+ donateService.getDonationByName("donate1"));
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }

    }
}

