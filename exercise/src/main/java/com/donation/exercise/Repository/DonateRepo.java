package com.donation.exercise.Repository;

import com.donation.exercise.beans.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonateRepo extends JpaRepository<Donation, Integer> {
    List<Donation> findByName(String name);
    List<Donation>findByDonationAmountLessThan(int amount);
    List<Donation> findByDonationAmountGreaterThan(int amount);

}
