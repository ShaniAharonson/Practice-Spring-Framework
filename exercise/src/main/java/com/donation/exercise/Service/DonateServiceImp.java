package com.donation.exercise.Service;

import com.donation.exercise.Exceptions.DonateSystemException;
import com.donation.exercise.Exceptions.ErrMsg;
import com.donation.exercise.Repository.DonateRepo;
import com.donation.exercise.beans.Donation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonateServiceImp implements DonateService {
    private final DonateRepo donateRepo;

    @Override
    public void addDonation(Donation donation) {
        donateRepo.save(donation);
    }

    @Override
    public List<Donation> donationsUnder_180(int amount) throws Exception {
        if (amount > 180) {
            throw new DonateSystemException(ErrMsg.PRICE_ERROR);
        } else {
            return donateRepo.findByDonationAmountLessThan(amount);
        }
    }

    @Override
    public List<Donation> donationsMoreThan_1800(int amount) throws Exception {
        if (amount < 1800) {
            throw new DonateSystemException(ErrMsg.PRICE_ERROR_2);
        } else {
            return donateRepo.findByDonationAmountGreaterThan(amount);
        }

    }

    @Override
    public List<Donation> getAllDonation() {
        return donateRepo.findAll();

    }

    @Override
    public List<Donation> getDonationByName(String name) {
        return donateRepo.findByName(name);
    }
}
