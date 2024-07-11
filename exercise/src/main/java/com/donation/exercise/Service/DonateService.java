package com.donation.exercise.Service;

import com.donation.exercise.Exceptions.DonateSystemException;
import com.donation.exercise.beans.Donation;

import java.util.List;

public interface DonateService {
    void addDonation(Donation donate) ;
    List<Donation> donationsUnder_180(int amount) throws Exception;
    List<Donation> donationsMoreThan_1800(int amount) throws Exception;
    List<Donation> getAllDonation();
    List<Donation> getDonationByName(String name) throws DonateSystemException;

}
