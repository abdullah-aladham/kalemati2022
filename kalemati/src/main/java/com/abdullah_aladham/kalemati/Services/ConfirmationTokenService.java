package com.abdullah_aladham.kalemati.Services;

import com.abdullah_aladham.kalemati.Registeration.Token.ConfirmationToken;
import com.abdullah_aladham.kalemati.Repo.ConfirmationTokenRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    private final ConfirmationTokenRepo confirmationTokenRepo;

public void saveConfirmationToken(ConfirmationToken Token){
confirmationTokenRepo.save(Token);
}

}
