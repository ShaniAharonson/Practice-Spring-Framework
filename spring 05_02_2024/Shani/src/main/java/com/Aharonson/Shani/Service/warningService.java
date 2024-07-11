package com.Aharonson.Shani.Service;

import com.Aharonson.Shani.Utils.WarningBanner;
import org.springframework.stereotype.Service;

@Service
public class warningService {
    public void SendBanner() {
        System.out.println(WarningBanner.myBanner);
    }
}
